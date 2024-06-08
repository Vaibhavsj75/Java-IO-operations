import java.io.File;

public class LaunchFile 
{
    public static void main(String[] args) 
    {
        // File file1=new File("pw.txt");

        // System.out.println(file1.exists()); //false

        // file1.createNewFile();
        // System.out.println(file1.exists()); //true


        File dir=new File("Hi");
        System.out.println(dir.exists()); //false

        dir.mkdir();

        System.out.println(dir.exists()); //true

    }
}
