package string04;

/*
    String类的构造函数（转换功能）
    1.public String(char[] value)
        将一个字符数组转换成一个字符串
    2.public String(char[] value, int offset, int count)
        将字符数组中，从offset位置开始，指定count个字符传换成字符串
    3.public char[] toCharArray() 
        将字符串传换成一个字符数组
 */

public class Demo01 
{
    public static void main(String[] args)
    {
        //method01();
        
        String str = "lnk";
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++)
        {
            System.out.println(charArray[i]);
        }
    }

    private static void method01() {
        char[] chars = {'a' , 'b' , 'h' , 'f'};
        String str = new String(chars);
        System.out.println(str);

        /*
        chars[1] = 's';
        System.out.println(str);//改变字符数组中的元素，不会导致原来转换后的字符串的变化
        */


        String str2 = new String(chars, 1, 2);//从chars数组中1开始截取两个字符（包含1索引字符）
        System.out.println(str2);//bh

        /*
        String str3 = new String(chars, 4, 2);//StringIndexOutOfBoundsException: Range [4, 4 + 2) out of bounds for length 4
                                                            //字符串索引越界异常
        System.out.println(str3);
        */
    }
}
