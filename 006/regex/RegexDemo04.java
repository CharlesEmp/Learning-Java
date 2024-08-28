package regex;

/*
    预定义字符规则：已经具有特殊含义的字符
    “.”：在正则中匹配任意字符，匹配长度为1 （只匹配一位字符）
    “\d”：相当于[0-9] （digit 数字）
    “\w”：相当于[a-zA-z_0-9] （word 单词）

 */

public class RegexDemo04 
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        System.out.println("a".matches("\\w"));
        System.out.println("1".matches("\\w"));
        System.out.println("%".matches("\\w"));
        System.out.println("_".matches("\\w"));
    }

    private static void method02() {
        System.out.println("1".matches("\\d"));    //true
        System.out.println("a".matches("\\d"));    //false
        System.out.println("19".matches("\\d\\d"));//true
    }

    private static void method01() {
        System.out.println("a".matches(".")); //true
        System.out.println("1".matches(".")); //true
        System.out.println("*".matches(".")); //true
        System.out.println("aa".matches("."));//true
        //由于“.”在正则中具有特殊含义，所以加上一个 \ 让他失去特殊含义，变成普通的 “.” 字符
        //“\.”不属于java语言中的转义字符（\n \r \t...），因此要再加一个 \ 让 “\” 失去转义的效果
        //简单认为 在java语言中 \\ 代表 \ 字符
        System.out.println(".".matches("\\."));//true
        System.out.println("a".matches("\\."));//false
    }
}
