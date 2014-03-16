import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TraumaTranslate {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception    {
        while(true) {
            String fin="", fout="", read="";

            try {
                System.out.print("Please enter filename or source code to translate:\n> ");
                fin = br.readLine();
                System.out.print("Please enter filename of result files:\n> ");
                fout = br.readLine();

                BufferedReader br = new BufferedReader(new FileReader(fin));
                while(true) {
                    String buffer = br.readLine();
                    if(buffer == null)
                        break;
                    read += buffer + "\n";
                }
            }
            catch(FileNotFoundException fnfe)   {
                System.out.println("File not found!");
            }

            boolean willTranslate = true;

            try {
                Process proc = Runtime.getRuntime().exec("./run.sh");

                OutputStreamWriter outWrite = new OutputStreamWriter(proc.getOutputStream());

                outWrite.write(read);
                outWrite.close();

                BufferedReader bread = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
                while(true)  {
                    String s = bread.readLine();
                    if(s == null)
                        break;
                    System.out.println(s);
                    willTranslate = false;
                }

                bread.close();
            }
            catch(Exception ex) {   }

            if(!willTranslate)
                break;

            Translator trans = new Translator(fin, fout);
            trans.translate();

            String choice;
            System.out.print("Do you want to translate another file? [Y/n]\n> ");
            choice = br.readLine();

            if(choice.charAt(0) == 'n') {
                br.close();
                break;
            }
        }
        return;
    }
}