package constructor08;

/*
    Super关键字与super语句；
        super关键字是用来调用父类的成员（成员变量和成员方法）
        super语句是用来调用父类的构造方法
 */

public class Son extends Father
{
    public Son()
    {
        super(13);//执行父类的Father（int i）构造方法
        System.out.println("Son的空参构造");
        super.method();//super.专门用来调用父类的成员方法
        method();//遵循就近原则，现在本类里面找
    }

    public void method()
    {
        System.out.println("Son的method方法");
    }
}
