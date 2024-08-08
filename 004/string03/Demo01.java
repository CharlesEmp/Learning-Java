package string03;

/*
    常量池：存放各种常量的一个“池子”，包含基本类型常量（整形，小数）和 字符串常量（双引号内的）
            如果常量池已经存在该常量，则不会创建新的常量，直接使用原有的
            如果常量池没有该常量，则直接创建新常量
    “==”：
        如果比较基本数据类型 —— 比较值
        如果比较引用数据类型 —— 比较地址值
    “equals”：
        如果子类没有重写Object类的equals —— 默认比较内存的地址值
        如果子类重写，按照子类重写的规则进行比较
 */

public class Demo01 
{
    public static void main(String[] args)
    {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "def";

        System.out.println(str1 == str2);//true
        System.out.println(str1.equals(str2));//true

        System.out.println(str2 == str3);//false
        System.out.println(str2.equals(str3));//false
    }
}
