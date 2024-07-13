package abstractclass;

public class Demo01
{
    public static void main(String[] args)
    {
        Frog f = new Frog();
        method01(f);

    }

    //将抽象类作为引用类型，放在方法的形参位置
    public static void method01(Animal a)
    {
        a.eat();
    }
}
