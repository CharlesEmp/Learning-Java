/*
	2.1定义打印数组元素方法
	按照给定的格式打印[11，33，44,22，55].
	
	假如有一个数组
		int arr = [11 , 33 , 44 , 22 , 55]
	1.打印格式特点 
		在第一个元素最左边有一个[
		接着打印数组间的元素，每个元素之间用 逗号 空格 隔开
		最后一个元素最右边有一个]
	2.按照abc分析逐步实现
*/

public class ArrayDemo01
{
	public static void main (String[] args)
	{
		// 1.声明一个数组
		int[] arr = {11 , 33 , 44 , 22 , 55};
		
		//按照指定格式去打印
		System.out.print("[");
		
		//打印数组元素
		//数组的遍历
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(i == (arr.length - 1))//最后一个元素
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i] + ", ");
			}
		}
		
		//结束括号
		System.out.print("]");
		
	}
}