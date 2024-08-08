package string03;


public class Demo02 
{
    public static void main(String[] args)
    {
        String str1 = "abc";
        String str2 = "def";
        String str3 = new String("abc");

        System.out.println(str1 == str3);//false
        System.out.println(str1.equals(str3));//true

        System.out.println(str2 == str3);//false
        System.out.println(str2.equals(str3));//false
    }
}
