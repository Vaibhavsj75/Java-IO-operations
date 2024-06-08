import java.io.File;
import java.io.IOException;

public class LaunchFile2 
{
        public static void main(String[] args)  throws IOException 
    {
        
        // File dir=new File("Hello World!");
        // System.out.println(dir.isDirectory());
        // dir.mkdir();
        // System.out.println("dir is refering to directory Hello World :"+ dir.isDirectory());

        // File file=new File(dir, "skill.txt");
        // file.createNewFile();
        // System.out.println("file is refering to skill.txt: "+ file.isFile());


        int count =0;

        //String s="IO";
        File f=new File("IO");

        String str[]=f.list();

        for(String name: str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("No of files are "+ count);

    }
}
