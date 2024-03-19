/*
	为了提高复用性
	将数组拼接算法，写在一个让法中
*/

public class ArrayDemo03
{
	public static void main (String[] args)
	{
		int[] arr = {11 , 33 , 44 , 22 , 55};
		
		String str = getArr(arr);
		
		System.out.print(str);
	}
	
	/*
		变化的量
			被打印的数组是不固定的，就把数组作为形参
		一般在方法中尽可能只解决一个需求，尽量不要混合在一起
	*/
	public static String getArr(int[] arr)
	{
		//声明字符串变量
		String str = "[";
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(i == (arr.length - 1))
			{
				str = str + arr[i];
			}
			else
			{
				str = str + arr[i] + ", ";
			}
		}
		
		str = str + "]";
		
		return str;
		
	}
}