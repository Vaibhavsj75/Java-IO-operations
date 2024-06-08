import java.io.*;

class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;


    public Cricketer(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
}

public class Serialization 
{
    public static void main(String[] args)  throws Exception
    {
        Cricketer c=new Cricketer("Virat", 32, 20000);

        FileOutputStream fos=new FileOutputStream("skill.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);

        oos.writeObject(c);
        oos.flush();
        oos.close();
    }
    
}

