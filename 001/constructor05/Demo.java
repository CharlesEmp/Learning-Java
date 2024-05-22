package constructor05;

public class Demo
{
    public static void main(String[] args)
    {
        Person p1 = new Person();//new person 调用空参构造

        Person p2 = new Person("char" , 19 , "man");

        Person p3 = new Person("illusion",20);

        /*Person p4 = new Person("lily");*/

        p3.Person("orz" , 19);
    }
}