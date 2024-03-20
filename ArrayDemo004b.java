/*
	冒泡排序算法：
			针对数组
		1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
		2.对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。
		  在这一点，最后的元素应该会是最大的数。
		3.针对所有的元素重复以上的步骤，除了最后一个。
		4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较.

	假设有一个数组{13 42 21 50 3}
*/

public class ArrayDemo004b
{
	public static void main (String[] args)
	{
		int[] arr = {13,42,21,50,3};
		
		for(int i = 0 ; i < (arr.length - 1) ; i++)
		{
			for(int j = 0 ; j < (arr.length - i - 1) ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}