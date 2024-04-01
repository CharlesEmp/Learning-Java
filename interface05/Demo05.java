package interface05;
/*
    接口中的私有方法：
        JDK 9(包含9)以上版本才能在接口中定义私有方法
    private 返回值类型 方法名(形参列表)
    {
    }

    接口中的私有方法只能在本接口中使用，不能被子类使用
*/

interface MyInter
{
    //私有方法
    private void method()
    {
        System.out.println("MyInter接口的method方法");
    }

    //默认方法
    default void show()
    {
        method();
        System.out.println("MyInter接口的show方法");
    }
}

class A implements MyInter
{

}

public class Demo05 
{
    public static void main(String[] args)
    {
        A a = new A();
        a.show();
    }
}
