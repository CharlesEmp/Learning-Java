package string05;

/*
    1.打印一个数组中所有姓张的人
 */

public class Demo03
{
    public static void main(String[] args)
    {
        String[] strs = {"张三" , "李四" , "王五" , "张三丰" , "张飞"};
        method01(strs);
    }

    private static void method01(String[] strs)
    {
        for(int i = 0 ; i < strs.length ; i++)
        {
            if (strs[i].startsWith("张"))
            {
                System.out.println(strs[i]);
            }
        }
    }
}
