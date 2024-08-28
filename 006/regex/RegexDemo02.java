package regex;

/*
    正则表达式
        本身也是一种字符串，只不过这个字符串正好是一个规则
    字符规则

    使用正则表达式
        Pattern p = Pattern.compile("a*b")
        Matcher m = p.matcher("aaaaab")
        boolean b = m.matches()
        简化写法
            boolean b = Pattern.matches("a*b", "aaaaab");
        也可以使用String类里的方法
            boolean matches = "abc".matches("abc");
    public static Pattern compile(String regex)//编译一个正则表达式
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo02 
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        //method03();

        //method04();

        System.out.println("\\".matches("\\\\"));//正则两个 \  匹配一个 \
        System.out.println("    ".matches("\t"));//我们在开发工具的编辑器内，会把tab转换成空格
        System.out.println(new Scanner(System.in).next().matches("\t"));//接收 字符串内容
        System.out.println(new Scanner(System.in).nextLine().matches("\t"));//接收下一行内容（包括制表符// ）
    }

    private static void method04() {
        //"\"在java中有特殊含义，代表转义
        System.out.println("\nabc");//"\n" 换行
        System.out.println("\\");//"\\" 相当于前一个\将后一个\ 转义成普通字符
        System.out.println("\\nabc");
    }

    private static void method03()
    {
        //matches通过字符串对象调用，传入的是正则表达式，判断字符串是否匹配传入的正则
        boolean matches = "abc".matches("abc");
        System.out.println(matches);//true
    }

    private static void method02()
    {
        //三合一写法（简化）
        boolean matches = Pattern.matches("abc" , "ab");
        System.out.println(matches);//false
    }

    private static void method01()
    {
        //1.编译一个正则表达式
        Pattern p = Pattern.compile("abc");
        //2.创建一个匹配器（matcher）使用传入的字符串，与正则相关联
        Matcher m = p.matcher("abc");
        //3.尝试用正则表达式与该字符串匹配
        boolean matcher = m.matches();
        System.out.println(matcher);//true
    }
}
