package static05;

/*
     static访问的注意是西昂
        1.静态方法中不能使用this和super关键字
            核心原因：由于静态成员和非静态成员加载时机
              由于静态成员方法随着类的加载而加载，当我们通过（类名.静态方法）来调用的时候
              此时对象可能根本不存在，那么我们就无法使用this和super关键字
        2.静态成员可以直接访问静态成员，不能直接访问非静态成员
        3.非静态成员可以直接访问静态成员，也可以直接访问非静态成员
              静态成员变量随着类的加载而加载
              非静态成员变量随着对象的创建而产生
              类的加载的时机 = 静态成员加载时机 ＞（优先于）对象的加载时机
 */

public class Demo 
{
    public static void main(String[] args)
    {
        Son son = new Son();
        son.show();
        son.method();

        //静态的main方法可以直接访问静态的method01
        method01();
    }

    public static void method01()
    {

    }
}
