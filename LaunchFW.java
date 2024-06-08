import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFW 
{
    public static void main(String[] args)  throws IOException
    {
        
        File dir=new File("Hi");

        File file=new File(dir, "skill.txt");
        // file.createNewFile();

        FileWriter fw=new FileWriter(file, true);

        fw.write("java");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[]={'j', 'a', 'v', 'a'};
        fw.write(ch);
        fw.write("\n");

        fw.write("\n");

        fw.close();
        fw.flush();

        System.out.println("open pw.txt to see result");
        
    }
}
