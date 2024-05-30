package static05;

public class Son extends Father
{
    int number = 11;
    static int j = 25;

    public void show()
    {
        System.out.println(this.number);
        System.out.println(super.number);
        System.out.println(j);
        System.out.println(number);
    }

    public static void method()
    {
        //1.静态方法中不能使用this和super关键字
        //System.out.println(this.number);
        //System.out.println(super.number);
        System.out.println("method");

        //2.静态成员可以直接访问静态成员
        System.out.println(j);
        //不能直接访问非静态成员
        //System.out.println(number);

        Son son = new Son();
        System.out.println(son.number);
    }
}
