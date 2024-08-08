package string05;

/*
    2.打印一个数组中所有后缀名为.png的文件名称
 */

public class Demo04 
{
    public static void main(String[] args)
    {
        String[] strs = {"1.png" , "2.txt" , "3.png" , "4.pdf"};
        for(int i = 0; i < strs.length ; i++)
        {
            if (strs[i].endsWith(".png"))
            {
                System.out.println(strs[i]);
            }
        }
    }
}
