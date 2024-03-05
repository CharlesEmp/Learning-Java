/*
	Continue：
		1. 只能用在循环中
		2. 一旦遇到continue，直接终止循环，执行下次循环（步进）
*/

public class ContinueDemo
{
	public static void main (String[] args)
	{
		int sum = 0;
		for (int i = 0 ; i <= 6 ; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println("i=" + i);
				continue;//终止本次循环，进入下次循环
			}
			sum = sum + i;
		}
		System.out.println("sum=" + sum);
		
	}
}