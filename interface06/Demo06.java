package interface06;
/*
    1.一个类可以实现多个接口（一个类只能直接继承一个类）
        格式：
            class 类名 implements 接口1，接口2......
*/

interface A
{
    void show1();
}

interface B
{
    void show2();
}

class C implements A , B
{
    @Override
    public void show1()
    {
        System.out.println("show1");
    }

    @Override
    public void show2()
    {
        System.out.println("show2");
    }
}


public class Demo06 
{
    public static void main(String[] args)
    {
        C c = new C();
        c.show1();
        c.show2();
    }
}
