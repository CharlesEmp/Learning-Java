package final03;

/*
    final修饰方法
        final修饰的方法不能被子类重写，但是可以被子类继承
        当自己定义的父类中的某些方法，不想被其他类重写，就可以加final修饰
 */

public class Father 
{
    public void method01()
    {
        System.out.println("Father的method01");
    }

    public final void method02()
    {
        System.out.println("Father的method02");
    }
}
