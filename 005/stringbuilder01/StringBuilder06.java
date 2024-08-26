package stringbuilder01;

/*
    已知一个整型数组
        int[] arr = {15 ,17 ,21 ,32}
    将这个数组以以下格式打印
    “[15， 17， 21， 32]”

    利用拼接的思想
 */

public class StringBuilder06 
{
    public static void main(String[] args)
    {
        //method01();

        int[] arr = {15 , 17 , 21 , 32};
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < arr.length; i++)
        {
            sb.append(arr[i]);
            if (i!=(arr.length-1))
            {
                //如果不是最后一个字符，拼接“，”
                sb.append(" , ");
            }
        }
        sb.append(" ]");
        System.out.println(sb);
    }

    private static void method01() {
        int[] arr = {15 , 17 , 21 , 32};
        //1.定义一个str变量存储第一部分
        String str = "[ ";
        //2.利用str拼接数组中的元素
        for (int i = 0; i < arr.length; i++)
        {
            /*
                if (i==(arr.length-1))
                {
                    str += arr[i]
                }
                else
                {
                    str += arr[i] + " , ";
                }
            */
            str += arr[i];
            if (i!=(arr.length-1))
            {
                //如果不是最后一个字符，拼接“，”
                str += " , ";
            }
        }
        //3.定义一个str变量存储最后部分
        str += " ]";

        //4.输出str
        System.out.println(str);
    }
}
