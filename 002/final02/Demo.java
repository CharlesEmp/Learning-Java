package final02;

/*
    final修饰变量
        按照定义位置划分
            1.类中方法内
                局部变量
            2.类中方法外
                成员变量
        按照类型划分
            1.基本类型
            2.引用类型
        ①final修饰局部变量
            一旦被final修饰，只能赋值一次（常量）
        ②final修饰成员变量
            一旦被final修饰，只能赋值一次
        ③final修饰引用变量
            一旦被final修饰，只能赋值一次，引用变量中存储的地址值不可改变（这个引用变量恒指向该对象）
 */

public class Demo 
{
    int number;
    final int age = 18;
    final int id;

    public Demo()
    {
        id = 123;
        //age = 1;
        //id = 1;
        //age和id被final修饰，只能被初始化一次
    }

    public static void main(String[] args)
    {
        int i = 3;
        i = 17;
        System.out.println(i);

        //①final修饰局部变量
        final int j = 10;
        //j = 27;//不能修改final修饰的（最终变量）j的值
        System.out.println(j);

        final int k;
        k = 13;
        System.out.println(k);

        //②final修饰成员变量
        Demo d = new Demo();
        System.out.println(d.id);
        //d.id = 123;

        //③final修饰引用变量
        final Demo d2 = new Demo();//d2中存储的是new Demo（）的内存地址值（哈希值）
        //d2 = new Demo();
    }
}
