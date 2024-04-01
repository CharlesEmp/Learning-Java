package interface03;
/*
    在接口中定义抽象方法

    在接口中定义抽象方法可以不用加public abstract，编译器会默认增加
*/

interface MyInter
{
    public abstract void method();
    void show();
}

class A implements MyInter
{
    @Override
    public void method()
    {
        System.out.println("A实现了MyInter的method方法");
    }

    @Override
    public void show()
    {
        System.out.println("A实现了MyInter的show方法");
    }
}

public class Demo03 
{
    public static void main(String[] args)
    {
        A a = new A();
        a.method();
        a.show();
    }
}
