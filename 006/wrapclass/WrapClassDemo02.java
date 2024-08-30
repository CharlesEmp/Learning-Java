package wrapclass;

/*
    Integer类：int类型的包装类
        成员变量
            public static final int MIN_VALUE //整数最大值
            public static final int MAX_VALUE //整数最小值
        成员方法
            public static Integer valueOf(int i)//将基本类型转成Integer对象
            public int intValue()               //返回Integer对象包含的int值
            public static int parseInt(String s)//将字符串（string）类型的整数，转成整数（int）类型
            //在所有的包装类中都有一个parseXxx的方法，该方法的主要作用都是将String类型的数值类型转换为对应的基本类型
            在 Character类型中没有parseCharacter方法
 */

public class WrapClassDemo02
{
    public static void main(String[] args)
    {
        //method01();

        Integer in = Integer.valueOf(3);
        System.out.println(in);//最终相当于in.toString 字符串“3”
        System.out.println(in.intValue());// 整数3

        int i = Integer.parseInt("15");//将字符串“15” 变成整形的“15”
        System.out.println(i);

        //int i2 = Integer.parseInt("abc");//NumberFormatException数字格式异常
                                           //由于需要转换的类型 不是 数字类型的字符串，无法转换直接报错

        double d = Double.parseDouble("3.14");
        System.out.println(d);
    }

    private static void method01() {
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647
    }
}
