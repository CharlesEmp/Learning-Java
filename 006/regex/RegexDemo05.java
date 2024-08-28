package regex;

/*
    数量词
        “ X? ”：匹配的字符 X 出现0次或1次
        “ X* ”：匹配的字符 X 出现0次或多次（ >=0 ）
        “ X+ ”：匹配的字符 X 出现1次或多次（ >=1 ）
        “ X{ n } ”：代表指定的字符 X 出现n次
        “ X{ n, } ”：代表指定的字符 X 至少出现n次（ >=n ）
        “ X{ n,m } ”：代表指定的字符 X 出现 n到m 次（ [n,m] ）
        “”：
        “”：
 */

public class RegexDemo05 
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        //method03();

        //method04();

        //method05();

        System.out.println("abcdef".matches("[a-z]*"));   //true
        System.out.println("abcdef".matches("[a-z]+"));   //true
        System.out.println("abcdef".matches("[a-z]{6}")); //true
        System.out.println("abcdef".matches("[a-z]{5,}"));//true

    }

    private static void method05() {
        System.out.println("aaaa".matches("a{4}"));    //true
        System.out.println("aaaaa".matches("a{4}"));   //false
        System.out.println("aaaa".matches("a{1,}"));   //true
        System.out.println(" ".matches("a{1,}"));      //false
        System.out.println("aaaa".matches("a{4,6}"));  //true
        System.out.println("aaaaaa".matches("a{4,6}"));//true
    }

    private static void method04() {
        System.out.println("aaa".matches("a+"));   //true
        System.out.println("a".matches("a+"));     //true
        System.out.println(" ".matches("a+"));     //false
        System.out.println("b".matches("a+"));     //false
        System.out.println("abbb".matches("a+b+"));//true
    }

    private static void method03() {
        System.out.println("a".matches("a*"));   //true
        System.out.println("aaaa".matches("a*"));//true
        System.out.println(" ".matches("a*"));   //true
        System.out.println("b".matches("a*"));   //false
    }

    private static void method02() {
        System.out.println("a".matches("a?")); //true
        System.out.println("aa".matches("a?"));//false
        System.out.println("b".matches("a?")); //false
    }


    private static void method01() {
        //如果字符串数量特别长，而且每一位规则相同，需要把规则写的特别长
        System.out.println("abcdef".matches("[a-z][a-z][a-z][a-z][a-z][a-z]"));
    }
}
