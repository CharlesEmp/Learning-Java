/*
	1.1  输出所有的水仙花数（自己写）
	一个3位数，其每位数字立方和等于其本身
	如153 = 1*1*1 + 3*3*3 + 5*5*5 = 1 + 27 + 125	
*/

public class LoopDemo01a
{
	public static void main (String[] args)
	{
		for(int a = 1 ; a < 10 ; a++)
		{
			for(int b = 0 ; b < 10 ; b++)
			{
				for(int c = 0 ; c < 10 ; c++)
				{
					int m = mix01(a , b , c);
					int n = mix02(a , b , c);
					if(m == n)
					{
						System.out.println(m);
					}
				}
			}
		}
		
	}
	
	public static int mix01 (int i , int j , int k)
	{
		int m = i * 100 + j * 10 + k ;
		return m;
	}
	public static int mix02 (int i , int j , int k)
	{
		int n = i * i * i + j * j* j + k * k * k ;
		return n;
	}
}