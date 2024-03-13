/*
	循环嵌套
		通用格式：循环结构嵌套可以任选两种
			循环结构
			{
				循环结构
				{
					循环结构
					{
						
					}
				}
			}
		以for循环嵌套for循环为例
		for（ ； ； ）
		{
				//语句
			for（； ； ；）
			{
				//语句
			}
			    //语句
		}
*/

/*
	利用System.out.print("*");
	在控制台打印以下图形
	****
	****
	****
*/

public class ForForDemo
{
	public static void main (String[] args)
	{
		for (int a = 0 ; a < 3 ; a++)
		{
			for (int i = 0 ; i < 4 ; i++)//打印一行四个 *
			{
				System.out.print("*");
			}
			System.out.println();//在数据末尾加一个换行
		}
	}
}  