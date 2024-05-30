package static02;

/*
    static修饰成员方法
        static既可以修饰成员变量，又可以修饰成员方法
        既可以通过对象来调用，
        也可以通过（类名.变量名）调用
        （类名.方法名（参数））
 */

public class Demo 
{
    public void func()
    {
        System.out.println("func");
    }

    public static void method()
    {
        System.out.println("method");
    }

    public static void method(int i)
    {
        System.out.println("含有一个参数的method");
    }

    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.func();
        d.method();
        d.method(13);

        Demo.method();
        Demo.method(17);

    }
}
