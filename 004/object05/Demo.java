package object05;

public class Demo
{
    public static void main(String[] args)
    {
        Person p1 = new Person("A", 28);
        Animal a = new Animal();

        System.out.println(p1.equals(a));//ClassCastException
                                         //Animal cannot be cast to class object05.Person
        System.out.println(p1.equals(p1));

        Person p2 = new Person("B", 30);
        System.out.println(p1.equals(p2));

        /*
            p1.equals(a)
                obj = a = new Animal()
                Person p = (Person) obj //Person p = (Person) new Animal()
                                        //由于Person和Animal之间没有继承关系，导致强制转换异常
         */
    }
}
