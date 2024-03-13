/*
	数组的遍历
	
*/

public class ArrayDemo04
{
	public static void main (String[] args)
	{
		double[] arr = { 32.2 , 45.4 , 62.7 , 99.5 };
		
		//如果数组中的元素很多，需要重复写很多次取值，很繁琐
		System.out.println(arr[0]);//32.2
		System.out.println(arr[1]);//45.4
		System.out.println(arr[2]);//62.7
		System.out.println(arr[3]);//99.5
		System.out.println("");
		
		for (int i = 0 ; i < arr.length ; i++)//让i从0变到3，就能依次打印数组中的元素
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
}