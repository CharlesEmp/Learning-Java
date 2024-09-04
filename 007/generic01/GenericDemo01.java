package generic01;

/*
    Jdk 5 新特性 ：泛型 广泛的类型
        根据泛型的定义位置，分为三种：
            1.类上的泛型
            2.方法上的泛型
            3.接口上的泛型
 */

public class GenericDemo01
{
    public static void method01(String str)
    {
        System.out.println(str);
    }

    public static void method02(Integer i)
    {
        System.out.println(i);
    }
    public static void main(String[] args)
    {
        method01("abxnd");
        method02(125);
    }
}
