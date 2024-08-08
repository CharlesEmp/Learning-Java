package string04;

/*
    统计一个字符串中的大写字符，小写字符，数字字符的个数
    “aBeC1”
    需求分析
        1.拆分，将字符串转换成字符数组，便于操作每个数组
        2.分别统计
            如果是大写字符，大写字符计数器+1
            如果是小写字符，小写字符计数器+1
            如果是数字字符，数字字符计数器+1
 */

public class Demo02 
{
    public static void main(String[] args)
    {
        //1.拆分，将字符串转换成字符数组，便于操作每个数组
        String str = "aBeC1TRi";
        char[] chars = str.toCharArray();

        //2.分别统计
        int count01 = 0;//大写
        int count02 = 0;//小写
        int count03 = 0;//数字

        for (int i = 0; i < chars.length; i++)
        {
            //3.判断字符属于那种
            if (chars[i] >= 'A' && chars[i] <= 'Z')
            {
                count01++;
            }
            else if (chars[i] >= 'a' && chars[i] <= 'z')
            {
                count02++;
            }
            else if (chars[i] >= '0' && chars[i] <= '9')
            {
                count03++;
            }
        }
        System.out.println("大写字符：" + count01 + "个");
        System.out.println("小写字符：" + count02 + "个");
        System.out.println("数字字符：" + count03 + "个");
    }
}
