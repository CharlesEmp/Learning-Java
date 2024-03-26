package extends01;

public class Demo01
{
    public static void main(String[] args)
    {
        Teacher t = new Teacher();
        t.teach();
        System.out.println("——————————————");

        t.name = "Char";
        t.teach();

        System.out.println("——————————————");
        t.salary = 4000;
        System.out.println(t.salary);
    }
}
