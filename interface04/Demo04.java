package interface04;
/*
    默认方法
        JDK 8(包含8）以上版本才能定义默认方法
    定义格式
        default 返回值类型 方法名 (形参列表)
        {
        }
    默认方法可以有方法体
    默认方法可以被子类重写

    当我们在接口中添加默认方法，所有的子类可以直接沿用
    不需要在修改子类的代码，提高了代码的复用性
*/

interface MyInter
{
    //默认方法 —— 非抽象
    default void method()
    {
        System.out.println("MyInter默认方法");
    }

    void show();
}

class A implements MyInter
{
    @Override
    public void show()
    {
        System.out.println("A类的show方法");
    }

    @Override
    public void method() {
        System.out.println("A类重写了MyInter的默认方法");
    }
}
public class Demo04 
{
    public static void main(String[] args)
    {
        A a = new A();
        a.method();
        a.show();
    }
}
