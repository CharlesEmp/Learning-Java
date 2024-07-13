package interfacedemo;

public class Demo02 
{
    public static void main(String[] args)
    {
        Swim s = method02();
        s.swimming();
    }

    public static Swim method02 ()
    {
        /*Dog dog = new Dog();
        return dog;*/

        return new Dog();
    }
}
