package string05;

/*
    3.打印一个数组中所有包含“美丽”这个词的字符串
 */

public class Demo05 
{
    public static void main(String[] args)
    {
        String[] strs = {"美丽动人" , "这个世界好美丽" , "张美丽" , "这是一个美丽的世界" , "美什么丽"};
        for(int i = 0; i < strs.length ; i++)
        {
            if (strs[i].contains("美丽"))
            {
                System.out.println(strs[i]);
            }
        }
    }
}
