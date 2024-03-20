/*
	二分法查找算法：
			使用前提： 数组必须有序
		{23，34，45，56，67，78，89}
*/

public class ArrayDemo006
{
	public static void main (String[] args)
	{
		int[] arr = {23,34,45,56,67,78,89};
		
		System.out.println(binarySearch(arr , 34));
		System.out.println(binarySearch(arr , 89));
		System.out.println(binarySearch(arr , 100));
		
	}
	
	public static int binarySearch(int[] arr , int key)
	{
		int min = 0;
		int max = arr.length-1;
		
		while(min <= max)
		{
			int mid = (min + max) / 2;
			if(key < arr[mid])
			{
				max = mid - 1;
			}
			else if(key > arr[mid])
			{
				min = mid + 1;
			}
			else
			{
				return mid;
			}
		}
		
		return -1;
	}
}