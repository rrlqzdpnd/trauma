import java.io.*;
import java.util.*;
import java.util.regex.*;

class Translator    {
    private String filein, fileout;
    private File fin, fout;
    private BufferedReader bread;
    private BufferedWriter bwrite;

    public Translator(String fin, String fout)  {
        this.filein = fin;
        this.fileout = fout;
        this.fin = new File(fin);
        this.fout = new File(fout);
    }

    public String[] translate() {
        StringBuilder className = new StringBuilder(fout.getName().replaceAll(".java", "").toLowerCase());
        className.setCharAt(0, Character.toUpperCase(className.charAt(0)));

        String newStr = fout.toString().replaceAll(fout.getName().replaceAll(".java", ""), className.toString());
        this.fout = new File(newStr);

        String classWrapper = "import java.io.*;\nimport java.util.*;\n\npublic class " + className + "\t{\n";
        boolean inMain = false, hasMain = false;

        try {
            this.bread = new BufferedReader(new FileReader(fin));
            this.bwrite = new BufferedWriter(new FileWriter(fout));
            bwrite.write(classWrapper);
            String buffer;
            while(true)   {
                buffer = bread.readLine();
                // System.out.println(buffer);

                if(buffer == null)
                    break;

                // System.out.println(Pattern.matches(".*?[a-z]+[ ]+[a-zA-Z_]+\\(.*?\\)[^;]*?", buffer) + "\t" + buffer);

                if(Pattern.matches(".*?[a-z]+[ ]+[a-zA-Z_]+\\(.*?\\)[^;]*?", buffer)) {
                    buffer = "static " + buffer;
                }

                if(Pattern.matches(".*?main\\(.*?\\).*?", buffer) && !hasMain)  {
                    buffer = "public static void main(String[] args) throws Exception\t{";
                    inMain = true;
                    hasMain = true;
                }
                if(Pattern.matches(".*?return.*?;", buffer) && inMain)   {
                    buffer = "";
                    inMain = false;
                }

                if(Pattern.matches(".*?echo[ ]*?.*?;", buffer))   {
                    buffer = buffer.replaceAll("echo ", "System.out.print(");
                    buffer = buffer.replaceAll(";", ");");
                }

                if(Pattern.matches(".*?:=.*?", buffer))
                    buffer = buffer.replaceAll(":=", "=");

                if(Pattern.matches(".*?float.*?;", buffer))
                    buffer = buffer.replaceAll("float", "double");

                if(Pattern.matches(".*?string.*?", buffer))
                    buffer = buffer.replaceAll("string", "String");

                bwrite.write("\t" + buffer + "\n");
            }
            bwrite.write("\n}");
            bread.close();
            bwrite.close();
            System.out.println("Finished translating " + fin.toString() + " to " + fout.toString());
        }
        catch(IOException ioe)  { ioe.printStackTrace(); }

        String fullFile = fout.toString().trim();
        String _className = className.toString().trim();
        String fileName = fout.getPath().trim().replaceAll(_className+".java", "");
        String[] toRet = {
            fullFile,
            _className,
            fileName
        };
        return toRet;
    }
}