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

public class MethodDemo02
{
	public static void main (String[] args)
	{
		//①
		/*public static int method01()
		  {
		  	  return 3;
		  }
		*/
		
		//②
		method02(13);
		//System.out.println(i);//报错——找不到符号
								//在main中不能使用method02中的i变量
		
		//④
		/*
		int width = 3;
		int length = 4;
		System.out.println(width * length);
		
		int width2 = 12;
		int length2 = 17;
		System.out.println(width2 * length2);
		*/
		System.out.println(getArea(3 , 4));
		System.out.println(getArea(12 , 17));
	}
	
	//①
	public static int method01 ()
	{
		return 3;
	}
	
	//②
	public static void method02 (int i)	
	{
		System.out.println(i);
	}
	
	//③
	/*
	public static void method02 (int i)//报错——已在类 MethodDemo02中定义了方法
	{
		
	}
	*/
	
	//⑤
	public static int getArea (int length , int width)
	{
		int area = length * width;
		return area;
	}
	
}