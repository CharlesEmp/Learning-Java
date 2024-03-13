/*
	数组的第二种定义格式 ———— 数组的静态初始化
		数据类型[] 数组名 = {数组元素1,数组元素2,......}
*/

public class ArrayDemo03
{
	public static void main (String[] args)
	{
		//定义一个数组
		int[] arr = { 25 , 37 , 48 };
		
		System.out.println(arr);//数组的地址值 [I@28a418fc
		System.out.println(arr[0]);//25
		System.out.println(arr[1]);//37
		System.out.println(arr[2]);//48
		
		arr[2] = 100;
		
		System.out.println(arr[0]);//25
		System.out.println(arr[1]);//37
		System.out.println(arr[2]);//100
		
	}
}