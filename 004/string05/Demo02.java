package string05;

/*
    子串：字符串中的连续的字符构成

    1.public boolean contains(CharSequence s)
        判断字符串是否包含指定的字符序列
    2.public boolean equalsIgnoreCase(String anotherString)
        无视大小写进行字符串的比较
 */

public class Demo02 
{
    public static void main(String[] args)
    {
        String str = "akgh";
        System.out.println(str.contains("kg"));//true
        System.out.println(str.contains("kh"));//false

        System.out.println("abc".equals("abc"));//true
        System.out.println("ABC".equals("abc"));//false
        System.out.println("ABC".equalsIgnoreCase("abc"));//true
    }
}
