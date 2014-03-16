import javax.swing.*;
import javax.swing.border.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TraumaGUI extends JFrame   {

    private JButton compileB, saveB, runB, openB, exitB;
    private JTextArea inputTA, errorTA;
    private JScrollPane inputSP, errorSP;
    private JViewport inputVP, errorVP;
    private JFileChooser fChooser;
    private String code;
    private File openFile;
    private boolean canTranslate = true;

    public TraumaGUI()  {
        Container pane = getContentPane();
        GridBagConstraints c = new GridBagConstraints();
        fChooser = new JFileChooser();
        FileNameExtensionFilter traumaFilter = new FileNameExtensionFilter("Trauma files only", "trm");
        fChooser.removeChoosableFileFilter(fChooser.getAcceptAllFileFilter());
        fChooser.setFileFilter(traumaFilter);

        pane.setLayout(new GridBagLayout());
        c.fill = GridBagConstraints.BOTH;

        /** Input Pane **/
        c.gridx = 0;
        c.gridwidth = 5;
        c.gridy = 1;
        c.ipadx = 600;
        c.ipady = 250;
        inputSP = new JScrollPane();
        inputVP = new JViewport();
        inputTA = new JTextArea();
        inputTA.setTabSize(4);
        inputTA.setLineWrap(true);
        inputTA.setWrapStyleWord(true);
        inputVP.setView(inputTA);
        inputSP.setViewport(inputVP);
        inputSP.setBorder(new LineBorder(new Color(0,0,0)));
        pane.add(inputSP, c);

        /** Error Pane **/
        c.gridy = 2;
        c.ipady = 250;
        errorSP = new JScrollPane();
        errorVP = new JViewport();
        errorTA = new JTextArea("You may view messages here.");
        errorTA.setEditable(false);
        errorTA.setLineWrap(true);
        errorTA.setWrapStyleWord(true);
        errorVP.setView(errorTA);
        errorSP.setViewport(errorVP);
        errorSP.setBorder(new LineBorder(new Color(255,0,0)));
        pane.add(errorSP, c);

        /** Buttons **/
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 0;
        c.ipady = 0;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.NONE;
        openB = new JButton("Open");
        openB.addActionListener(new ButtonHandler());
        pane.add(openB, c);

        c.gridx = 1;
        saveB = new JButton("Save");
        saveB.addActionListener(new ButtonHandler());
        pane.add(saveB, c);

        c.gridx = 2;
        compileB = new JButton("Compile");
        compileB.addActionListener(new ButtonHandler());
        pane.add(compileB, c);

        c.gridx = 3;
        runB = new JButton("Run");
        runB.addActionListener(new ButtonHandler());
        pane.add(runB,c);

        c.gridx = 4;
        exitB = new JButton("Exit");
        exitB.addActionListener(new ButtonHandler());
        pane.add(exitB, c);

        setTitle("Trauma");
        setSize(630, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    private class ButtonHandler implements ActionListener {
        private File file;

        private void save() {
            if(file != null)    {
                try {
                    FileWriter fw = new FileWriter(file);
                    fw.write(TraumaGUI.this.inputTA.getText());
                    fw.close();
                    TraumaGUI.this.code = inputTA.getText();
                    TraumaGUI.this.openFile = fChooser.getSelectedFile();
                    TraumaGUI.this.setTitle("Trauma - " + file.toString());
                }
                catch(IOException ioe)  {   }
                System.out.println("Done saving to " + file.toString());
            }
        }

        public void actionPerformed(ActionEvent e)  {
            Object source = e.getSource();
            if(source == saveB)  {
                int retval = fChooser.showSaveDialog(TraumaGUI.this);
                if (retval == JFileChooser.APPROVE_OPTION)   {
                    this.file = fChooser.getSelectedFile();

                    this.save();
                }
            }
            else if(source == openB)    {
                TraumaGUI.this.inputTA.setText("");
                int retval = fChooser.showOpenDialog(TraumaGUI.this);
                if(retval == JFileChooser.APPROVE_OPTION)   {
                    this.file = fChooser.getSelectedFile();
                    try {
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        while(true) {
                            String buff = br.readLine();
                            if(buff == null)
                                break;

                            String textArea = inputTA.getText();
                            inputTA.setText(textArea + "\n" + buff);
                        }
                        br.close();
                        TraumaGUI.this.code = inputTA.getText();
                        TraumaGUI.this.openFile = fChooser.getSelectedFile();
                        TraumaGUI.this.setTitle("Trauma - " + file.toString());
                    }
                    catch(IOException ioe)  {   }
                    System.out.println("Opened file: " + TraumaGUI.this.openFile.toString());
                }
            }
            else if(source == exitB)    {
                try {
                    if(TraumaGUI.this.code.compareTo(TraumaGUI.this.inputTA.getText()) != 0) {
                        String[] buttonOptions = {"Save", "Don't Save", "Cancel"};
                        int dialogResult = JOptionPane.showOptionDialog(null, "Would you like to save before exiting?", "File not saved", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, buttonOptions, buttonOptions[2]);
                        if(dialogResult == 0)   {
                            TraumaGUI.this.saveB.doClick();
                            System.exit(0);
                        }
                        else if(dialogResult == 1)
                            System.exit(0);
                    }
                    else
                        System.exit(0);
                }
                catch(NullPointerException npex)    {
                    System.exit(0);
                }
            }
            else if(source == compileB) {
                System.out.println("Compiling " + TraumaGUI.this.openFile + "...");
                TraumaGUI.this.errorTA.setText("");
                TraumaGUI.this.canTranslate = true;
                TraumaGUI.this.saveB.doClick();

                try {
                    Process proc = Runtime.getRuntime().exec("./run.sh");

                    OutputStream outStrm = proc.getOutputStream();
                    OutputStreamWriter outWrite = new OutputStreamWriter(outStrm);
                    outWrite.write(TraumaGUI.this.inputTA.getText());
                    outWrite.close();

                    BufferedReader read = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
                    while(true) {
                        String s = read.readLine();
                        if(s == null) 
                            break;
                        TraumaGUI.this.errorTA.setText(TraumaGUI.this.errorTA.getText() + "\n" + s);
                        TraumaGUI.this.canTranslate = false;
                    }
                }
                catch(IOException ioe)  {   }
                System.out.println("Done compiling!");
            }
            else if(source == runB) {
                TraumaGUI.this.errorTA.setText("");
                if(TraumaGUI.this.openFile != null)    {
                    System.out.println("Running " + TraumaGUI.this.openFile + "...");
                    TraumaGUI.this.compileB.doClick();
                    if(TraumaGUI.this.canTranslate) {
                        String outputFile = TraumaGUI.this.openFile.toString().replaceAll(".trm", ".java");
                        Translator translate = new Translator(TraumaGUI.this.openFile.toString(), outputFile);
                        System.out.println("Created translate instantiation");
                        String[] outFile = translate.translate();

                        try {

                            String command = "./run2.sh";

                            Process proc = Runtime.getRuntime().exec(new String[] {command, outFile[0], outFile[1], outFile[2]});

                            BufferedReader read = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                            while(true) {
                                String s = read.readLine();
                                if(s == null) 
                                    break;
                                TraumaGUI.this.errorTA.setText(TraumaGUI.this.errorTA.getText() + "\n" + s);
                                TraumaGUI.this.canTranslate = false;
                            }
                        }
                        catch(IOException ioe)  {   }
                        catch(IllegalArgumentException iae) {   }
                    }
                }
            }
        }
    }

    public static void main(String[] args)  {

        new TraumaGUI();
    }
}