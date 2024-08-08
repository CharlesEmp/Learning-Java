package string04;

/*
    1.public String toLowerCase()
        将字符串的所有字符转换成小写
    2.public String toUpperCase()
        将字符串的所有字符转换成小写
 */

public class Demo03 
{
    public static void main(String[] args)
    {
        String str = "abdf";
        System.out.println(str.toUpperCase());//ABDF

        System.out.println("ABDEF".toLowerCase());//abdef
    }
}
