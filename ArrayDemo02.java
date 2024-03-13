/*
	数组的定义格式
		1.第一种定义格式 ———— 数组的动态初始化
			数据类型[] 数组名 = new 数据类型[数组的长度（整数）];
			
	JVM内存划分：
		栈区：存放方法：方法中的局部变量会随着方法的入栈而入栈
			  局部变量：定义在main中的变量
		堆区：new 出来的东西
		
	16进制：0-9 A-F （通过这些数字和字母来组成十六进制数）
		一般作用内存地址值
		例如 ：3AF 4C 0x72 （0x表示十六进制数）
		
	数组的使用方式：
		格式： 
			取值方式：数组名[数组空间编号(索引)]
			赋值方式：数组名[索引]=值
			
*/

public class ArrayDemo02
{
	public static void main (String[] args)
	{
		//1.声明一个数组
		int[] arr = new int[3];//相当于声明了一个名称为arr的数组
							   //相当于一次性声明了3个变量来储存数据
		
		System.out.println(arr);//[I@28a418fc 相当于打印了数组的地址
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//0
		System.out.println(arr[2]);//0
		
		arr[1] = 13;
		
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//12
		System.out.println(arr[2]);//0
		
	}
}