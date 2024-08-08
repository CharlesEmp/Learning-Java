package string05;

/*
    从方法名推断方法的作用
    从形参类型判断可传入的值
    从返回值类型判断返回的结果
    1.public boolean startsWith(String prefix)
        判断一个字符串是否以某个指定的字符串开始，如果是，返回真
    2.public boolean endsWith(String suffix)
        判断一个字符串是否以某个指定的字符串结尾，如果是，返回真
 */

public class Demo01 
{
    public static void main(String[] args)
    {
        String str = "aegh";
        boolean b = str.startsWith("ae");//判断str是以“ae”开头
        boolean b2 = str.startsWith("ag");//判断str是以“ag”开头
        System.out.println(b);
        System.out.println(b2);

        System.out.println("你好吗".endsWith("吗"));
    }
}
