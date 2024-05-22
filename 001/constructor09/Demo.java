package constructor09;

public class Demo 
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("小灰");
        System.out.println(dog.name);

        Pig pig = new Pig("如花");
        System.out.println(pig.name);
    }
}
