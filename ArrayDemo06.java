/*
	数组求最值（最大值或者最小值）
		已知一个数组：int[] arr = { 100 , 12 , 75 , 103 , 1 }
		利用数组中最大值的算法（思想）找出最大值
*/

public class ArrayDemo06
{
	public static void main (String[] args)
	{
		int[] arr = { 100 , 12 , 75 , 103 , 1 };
		int max = arr[0];
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
			System.out.println("第" + i + "次比较，较大值是：" + max);
		}
		System.out.println("最大值是：" + max);
		
	}
}