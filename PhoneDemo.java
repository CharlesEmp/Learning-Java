package Demo03;
/*
    引用类型作为形参，形参的改变引起实参的改变
*/
public class PhoneDemo
{
    public static void main(String[] args)
    {
        //创建一个对象
        Phone p = new Phone();

        //给成员变量赋值
        p.brand = "华为";

        //调用方法
        method(p);

        System.out.println(p.brand);

    }
    public static void method(Phone x)
    {
        x.brand = "小米";
    }
}
