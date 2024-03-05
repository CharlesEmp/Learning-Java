/*
	for循环练习：
		利用for循环计算 1+2+3+4+5
	分析：
		拆成两两求和运算：
			每次相加的结果与下一个数相加
*/

public class ForDemo02
{
	public static void main (String[] args)
	{
		int a = 1;
		int b = 0;
		
		for ( ; a < 6 ; a++)
		{
			b = b + a;
			System.out.println("a=" + a + ",b=" + b);
		}
		
		System.out.println(b);
		
	}
}