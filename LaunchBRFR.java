import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class LaunchBRFR 

{
    public static void main(String[] args)  throws Exception
    {
        File dir=new File("Hi");
        File file=new File(dir, "skill.txt");

        FileReader fw=new FileReader(file);
        BufferedReader br=new BufferedReader(fw);

        String line=br.readLine();

        while (line!=null) 
        {
            System.out.println(line);
            line=br.readLine();
        }
    }
}
