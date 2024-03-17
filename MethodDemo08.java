/*
	引用类型的值传递：
		引用类型在传递值的时候，传递的是地址值
		（形参的改变会影响实参）
*/

public class MethodDemo08
{
	public static void main (String[] args)
	{
		int[] arr = {3 , 6 , 11};
		method(arr);
		for (int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);//3 13 11
		}
	}
	
	
	public static void method(int[] arr)
	{
		arr[1] = 13;
		
	}
}