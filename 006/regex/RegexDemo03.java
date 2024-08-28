package regex;

/*
    字符类规则
        [abc]：匹配 a 或 b 或 c
        [^abc]：匹配 除了 a b c 三者之一
        [a-zA-z]：匹配26个大小写字母之一
        [a-zA-z_0-9]：匹配26个大小写字母、下划线、0到9数字之一
            []的规则：要求字符串只有一位
 */

public class RegexDemo03 
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        System.out.println("C".matches("[a-zA-z]")); //true
        System.out.println("m".matches("[a-zA-z]")); //true
        System.out.println("_".matches("[a-zA-z_0-9]")); //true
        System.out.println("3".matches("[a-zA-z_0-9]")); //true
    }

    private static void method02() {
        System.out.println("a".matches("[^abc]")); //false
        System.out.println("d".matches("[^abc]")); //true
    }

    private static void method01() {
        //匹配单个字符
        System.out.println("a".matches("[abc]")); //true
        System.out.println("b".matches("[abc]")); //true
        System.out.println("ab".matches("[abc]"));//false
        System.out.println("ab".matches("[abc][abc]"));//true
    }
}
