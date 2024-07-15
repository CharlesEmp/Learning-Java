package object04;


public class Demo
{
    public static void main(String[] args)
    {
        Person p1 = new Person("A", 19);
        Person p2 = new Person("B", 20);
        System.out.println(p1.equals(p2));

        Person p3 = new Person("A", 19);
        Person p4 = new Person("A", 19);
        System.out.println(p3.equals(p4));
    }
}
