/*
	数组的两个注意事项
		2.数组索引越界
		  数组中的索引范围 0 ~ （arr.length-1）
		  一旦超出最大索引 或 不在正确索引范围内，就会报数组索引越界
*/

public class ArrayDemo08
{
	public static void main (String[] args)
	{
		//动态初始化一个数组
		int[] arr = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: Index 3
								   //数组索引越界异常 3代表3索引越界
	}
}