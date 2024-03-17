/*
	方法的注意事项;
		1.方法定义在类中和其他方法并列，不能方法套方法 【定义在类中其他方法外】
		2.方法形参上定义的变量作用域仅仅在方法中
		3.不能定义两个完全相同的方法
		4.定义好的方法可以反复使用，提高代码的复用性
		5.调用方法传参的时候支持类型的自动提升
		6.如果返回值类型为void不能return值，也不能直接打印
		7.如果返回值类型不是void可以直接打印
		8.如果方法返回值类型不是void，针对返回值我们可以获取也可以不获取

*/

public class MethodDemo03
{
	public static void main (String[] args)
	{
		//⑤
		method05(4.3);
		method05(5);
		
		//⑥，⑦
		int m = method07(10);
		System.out.println(m);
		
		System.out.println(method07(10));
		//System.out.println(method05(5.2));//报错——此处不允许使用 '空' 类型
		
		//⑧
		method07(12);
	}
	
//——————————————————————————————————————————————————————————————————	
	
	
	//⑤
	public static void method05 (double d)//double d = 5;//可以从int自动转换成double
	{
		System.out.println(d);
	} 
	
	//⑥
	public static void method06a (int i , int j)
	{
		System.out.println(i+j);
		//return i;//报错——不兼容的类型: 意外的返回值
				   //不能返回任何值，因为定义上的返回类型是void
		return;//终止方法
	}
	public static int method07 (int i)
	{
		return i;
	}
}