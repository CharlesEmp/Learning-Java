package extends04;

class Father
{
    public void show()
    {
        System.out.println("Father");
    }
}

class Son extends Father
{
    public void show()
    {
        super.show();//调用Father
        System.out.println("Son");
    }
}
public class Demo02
{
    public static void main(String[] args)
    {
        Son son = new Son();
        son.show();
    }
}
