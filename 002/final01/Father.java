package final01;

/*
    final修饰类:
        final修饰的类不能被继承（结扎）
        如果以后定义一个类，不想被别人继承（不想有子类），可以在类上加上final修饰

        加final修饰的类，可以继承类也可以实现接口
 */

public final class Father extends GrandFather
{
    public void method()
    {
        System.out.println("method");
    }
}
