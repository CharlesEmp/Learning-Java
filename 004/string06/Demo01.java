package string06;

/*
    获取方法
    1.public int length()
        返回此字符串的长度（字符个数）
    2.public String substring(int beginIndex)
        从字符串的指定索引开始，一直截取刀字符串末尾
    3.public String substring(int beginIndex, int endIndex)
        截取[beginIndex]到[endIndex]中间的字符（包含beginIndex不包含endIndex）
 */

public class Demo01 
{
    public static void main(String[] args)
    {
        //method01();

        String str = "deghk";
        String substring01 = str.substring(2);
        System.out.println(substring01);//ghk
        System.out.println(str);//原字符串不变

        System.out.println(str.substring(2 , 3));//g
        System.out.println(str.substring(1 , 4));//egh
    }

    private static void method01() {
        String str = "abcdef";
        System.out.println(str.length());//字符串获取长度，调用length方法

        char[] chars = str.toCharArray();
        System.out.println(chars.length);//length是数组的专用属性，求的是数组长度
    }
}
