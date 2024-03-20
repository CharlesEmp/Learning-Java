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

public class ArrayDemo004a
{
	public static void main (String[] args)
	{
		int[] arr = {13,42,21,50,3};
		int l = arr.length;
		for( ; l > 1 ; l--)
		{
			for(int i = 0 ; i < (l - 1) ; i++)
			{
				if(arr[i] > arr[i+1])
				{
					int a = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = a;
				}
			}
		}
		
		System.out.print("[");
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}
}