package object02;

public class Demo 
{
    public static void main(String[] args)
    {
        Person p = new Person("A", 19);
        System.out.println(p);//默认调用toString，遵循就近原则（重写后的）
        System.out.println(p.toString());
    }
}
