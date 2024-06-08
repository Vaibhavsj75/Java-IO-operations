import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;

public class LaunchBWFW 
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("Hi");
        File file=new File(dir, "skill.txt");

        FileWriter fw=new FileWriter(file, true);
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("Java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[]={'P', 'w', 's', 'j'};
        bw.write(ch);

        bw.flush();
        bw.close();
    }
}
