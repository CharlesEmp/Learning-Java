/*
	1.1  输出所有的水仙花数（课例）
	  一个3位数，其每位数字立方和等于其本身
	  如153 = 1*1*1 + 3*3*3 + 5*5*5 = 1 + 27 + 125
	(	1.三位数范围 100-999
		2.水仙花数的条件 number = number百位的立方 + number十位的立方 + number个位的立方
	)
*/

public class LoopDemo01b
{
	public static void main (String[] args)
	{
		/*
		//判定某个三位数是否是水仙花数
		int number = 352;
		//获取每位数字
		int ge = number % 10;
		int shi = number / 10 % 10;
		int bai = number / 100 % 10;
		System.out.println(ge + " " + shi + " " + bai);
		
		//判定是否为水仙花数
		if( ge * ge * ge + shi * shi * shi + bai * bai * bai == number)
		{
			System.out.println(number + "是水仙花数");
		}
		else
		{
			System.out.println(number + "不是水仙花数");
		}
		*/
		
		print();
		
	}
	
	public static void print()
	{
		for(int number = 100 ; number < 1000 ; number++)
		{
			//获取每位数字
			int ge = number % 10;
			int shi = number / 10 % 10;
			int bai = number / 100 % 10;
			
			//判定是否为水仙花数
			if( ge * ge * ge + shi * shi * shi + bai * bai * bai == number)
			{
				System.out.println(number + "是水仙花数");
			}
		}
	}
}