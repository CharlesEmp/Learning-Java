package extends03;

class A
{
    int num = 21;
}

class B extends A
{
    int num = 33;

    public void show()
    {
        int num = 55;
        System.out.println(num);
        /*
            查找顺序：
                局部变量 —— 本类成员 —— 父类成员 —— ...... ——Object
        */
        System.out.println(this.num);//通过this.调用本类成员变量
        System.out.println(super.num);//通过super关键字调用父类成员
    }
}

public class Demo03
{
    public static void main(String[] args)
    {
        B b = new B();
        b.show();
    }
}
