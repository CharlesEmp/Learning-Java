/*
	数组的两个注意事项
		1.数组空指针
			null  空常量  只能赋值给引用数据类型（数组）
			数组变量一旦赋值null变量，那么数组名就会和堆中的数组失去联系，无法再操作数组中的元素
		2.数组索引越界
*/

public class ArrayDemo07
{
	public static void main (String[] args)
	{
		//动态初始化一个数组
		int[] arr = new int[3];
		arr = null ;//arr中不再存储数组的地址值
		System.out.println(arr[0]);//NullPointerException 空指针异常
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
}