package interface06;
/*
    一个类可以继承另外一个类，同时实现多个接口
        格式：
            class 类名1   extends 类名2 implements 接口1，接口2......
*/

interface Inter1
{
    void show();
}

class Father
{
    public void method()
    {
        System.out.println("Father的method方法");
    }
}

class Son extends Father implements Inter1
{
    @Override
    public void show()
    {
        System.out.println("Son实现了show方法");
    }

    @Override
    public void method()
    {
        System.out.println("Son重写的method方法");
    }
}

public class Demo07 
{
    public static void main(String[] args)
    {
        Son son = new Son();
        son.show();
        son.method();
    }
}
