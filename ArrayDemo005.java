/*
	数组的普通查找算法：
			从数组的第一个位置开始逐个对照 直到找到被查找的元素
			如果数组中的元素与待查找元素全部对比发现都不相同，说明待查找元素在数组中不存在
		已知一个数组{23，34，45，56，67，78，89}
			待查找的元素： 56 位置：3  
			待查找的元素：100 位置：找不到
*/

public class ArrayDemo005
{
	public static void main (String[] args)
	{
		int[] arr = {23,34,45,56,67,78,89};
		
		int index = findIndex(arr , 67);
		
		if(index == -1)
		{
			System.out.println("未查找到该元素");
		}
		else
		{
			System.out.println("查找元素索引在：" + index);
		}
	}
	
	/*
		查找中变化的量
			数组
			查找元素
		返回值类型
			索引位置
	*/
	public static int findIndex (int[] arr , int key)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		//当循环走完，才能说明key与数组中的元素都比较了一遍
		//如果走到for循坏外说明没执行return i，则说明元素未找到
		return -1;
	}
}