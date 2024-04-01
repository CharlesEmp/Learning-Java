package interface06;
/*
    一个接口可以继承多个接口
        格式
            interface 接口名1 extends 接口名2，接口名3.......
*/

interface inter2
{
    void show();
}

interface inter3
{
    void method();
}

interface inter4 extends inter2 , inter3
{

}

class M implements inter4
{
    @Override
    public void show()
    {
        System.out.println("show");
    }

    @Override
    public void method()
    {
        System.out.println("method");
    }
}

public class Demo08 
{
    public static void main(String[] args)
    {
        M m = new M();
        m.method();
        m.show();
    }
}
