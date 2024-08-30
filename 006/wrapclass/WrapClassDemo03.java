package wrapclass;

/*
    JDK版本高于5
    自动装箱：将基本数据类型自动转换成对应的包装类对象
        （基本类型变成引用类型）
    自动拆箱：将基本类型包装类对象中 封装的值 赋值给 对应的基本类型
        （引用类型变成基本类型）
 */

public class WrapClassDemo03
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        Integer i = 13;//自动装箱 Integer i = Integer.valueOf(13);
        i += 3;//自动拆箱 i.intValue() 取出13
               // 13 + 3 = 16
               //自动装箱 Integer i =Integer.valueOf(16)
        System.out.println(i);
    }

    private static void method02() {
        int i = Integer.valueOf(15);//底层相当于int i = Integer.valueOf(15).intValue
    }

    private static void method01() {
        Integer i = Integer.valueOf(3);//类似于 Person p = new Person();
        Integer i2 = 3;//触发了自动装箱机制
                       //编译器底层：Integer i2 = Integer.valueOf(3);
                       //String str = "abc";
    }
}
