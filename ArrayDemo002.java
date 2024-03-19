/*
	2.1定义打印数组元素方法
	按照给定的格式打印[11，33，44,22，55].
	
	利用字符串拼接思想
		1.字符串存储"["		//String str = "["
		2.利用字符串拼接数组元素
		3.字符串存储"]"		//String str = "]"
*/

public class ArrayDemo02
{
	public static void main (String[] args)
	{
		int[] arr = {11 , 33 , 44 , 22 , 55};
		
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
		
		System.out.print(str);
		
	}
}