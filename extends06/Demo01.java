package extends06;
/*
    @Override强制子类的方法重写父类的方法，如果不重写就报错
    防止忘记重写
 */
class A
{
    public void method()
    {

    }
}

class B extends A
{
    @Override//重写标记
    public void method()
    {

    }
}
public class Demo01
{

}
