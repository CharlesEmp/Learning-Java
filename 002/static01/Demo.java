package static01;

/*
    static修饰变量
        局部变量
            static不能修饰局部变量
        成员变量
            static可以修饰成员变量
            使用
                1.可以被对象调用，就像是使用普通成员变量一样
                2.可以通过（类名.静态变量名）直接调用，不许创建对象
 */

public class Demo 
{
    int i = 3;//普通成员变量
    static int number = 11;//静态成员变量

    public static void main(String[] args)//静态的
    {
        //static int j = 23;//static不能修饰局部变量
        Demo d = new Demo();
        System.out.println(d.i);//通过对象调用普通成员变量
        System.out.println(d.number);//通过对象也可以调用静态成员变量
        System.out.println(Demo.number);//静态成员也可以通过（类名.xx）来调用
    }
}
