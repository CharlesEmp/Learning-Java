/*
	If的第二种结构
	格式：
		if(布尔表达式)
		{
			布尔表达式为true，执行if
		}
		else
		{
			布尔表达式为false，执行else
		}
*/

public class IfDemo02
{
	public static void main (String[] args)
	{
		int number = 10;
		if(number % 2 == 0)
		{
			System.out.println("偶数");
		}
		else
		{
			System.out.println("奇数");
		}
		System.out.println("程序结束");
		
	}
}