/*
	数组求和
		需求：已知一个整型数组，里面有四个元素，需要求出数组中所有元素的和
		例如：int[] arr = { 13 , 15 , 12 , 17 };
				13 + 15 + 12 + 17
*/

public class ArrayDemo05
{
	public static void main (String[] args)
	{
		int[] arr = { 13 , 15 , 12 , 17 };
		int sum = 0 ;
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum = sum + arr[i];
			/*
				第一次循环：sum = 0 + arr[0] = 0 + 13 = 13
				第二次循环：sum = 13 + arr[1] = 13 + 15 = 28
				第三次循环：sum = 28 + arr[2] = 28 + 12 = 40
				第四次循环：sum = 40 + arr[3] = 40 + 57 = 57
			*/
		}
		System.out.println("sum="+sum);//57
		
	}
}