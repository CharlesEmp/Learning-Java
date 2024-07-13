package interfacedemo;

public class Demo01 
{
    public static void main(String[] args)
    {
        /*Dog d = new Dog();
        method01(d);*/

        method01(new Dog());
    }

    public static void method01 (Swim s)
    {
        s.swimming();
    }
}
