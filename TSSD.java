
import java.beans.Transient;
import java.io.*;

class Cricketer1 implements Serializable
{
    String name;
    Transient int age;
    int runs;


    public Cricketer1(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }

    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }

}

public class TSSD 
{
    public static void main(String[] args)  throws Exception
    {
        // Cricketer1 c=new Cricketer1("Virat", 32, 20000);
        // c.disp();

        // FileOutputStream fos=new FileOutputStream("skill.txt");
        // BufferedOutputStream bos=new BufferedOutputStream(fos);
        // ObjectOutputStream oos=new ObjectOutputStream(bos);

        // oos.writeObject(c);
        // oos.flush();
        // oos.close();


        FileInputStream fis=new FileInputStream("skill.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        Cricketer1 cr=(Cricketer1)ois.readObject();
        cr.disp();

        ois.readObject();
        ois.close();

    }
    
}
