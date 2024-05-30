package static03;

/*
    类中的静态成员（成员方法 成员变量）随着类的加载而加载，存放在方法区中
    类中的非静态成员变量，随着对象的创建而产生，存放在堆区中

    通过对象去访问非静态成员变量，会在对象中查找
    通过对象去访问静态成员变量，会在方法去中查找

*/

public class Demo 
{
    int i = 3;
    static int num = 11;

    public static void method()
    {
        System.out.println("method");
    }

    public void func()
    {
        System.out.println("func");
    }

    public static void main(String[] args)
    {
        //调用静态成员
        System.out.println(Demo.num);
        Demo.method();

        //调用非静态成员
        Demo d = new Demo();
        System.out.println(d.i);
        d.func();
    }
}
