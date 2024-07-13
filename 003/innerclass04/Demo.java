package innerclass04;

/*
    局部内部类
        定义在局部位置(类中方法内)的类
*/

public class Demo 
{
    public void method()
    {
        //局部内部类
        class Inner
        {
            public void func()
            {
                System.out.println("Inner的func方法");
            }
        }

        new Inner().func();
    }

    public static void main(String[] args)
    {
        new Demo().method();
    }
}
