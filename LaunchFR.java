import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LaunchFR 
{
    public static void main(String[] args) throws Exception {
        
        // File dir=new File("Hi");
        // File file=new File(dir, "skill.txt");

        // FileReader fd=new FileReader(file);

        // int i=fd.read();
        // // System.out.println((char)i);

        // while (i!=-1) 
        // {
        //     System.out.print(i+ "---->");
        //     System.out.println((char)i);
        //     i=fd.read();
        // }


        File dir=new File("Hi");
        File file=new File(dir, "skill.txt");

        FileReader fd=new FileReader(file);

        char ch[]=new char[(int)file.length()];

        // int i=fd.read();

        fd.read(ch);

        for(char data:ch)
        {
            System.out.print(data);
        }


        

        // while (i!=-1) 
        // {
        //     System.out.print(i+ "---->");
        //     System.out.println((char)i);
        //     i=fd.read();
        // }

    }
}
