package constructor08;

public class Father 
{
    public Father()
    {
        System.out.println("Father的空参构造");
    }

    public Father(int i)
    {
        System.out.println(i + " " + "Father的单参构造");
    }

    public void method()
    {
        System.out.println("Father的method方法");
    }
}
