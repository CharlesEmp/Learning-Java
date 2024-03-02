/*
	Java基本类型分类
		整型
			byte
			short
			int：默认类型
			long
		浮点型
			float
			double：默认类型
		字符型
			char（character）
		布尔型
			boolean
	变量定义格式：
		变量类型	变量名 = 数值；（声明了一个变量）
*/

public class VariableDemo
{
	public static void main (String[] args)
	{
	//整型
		byte b = 13;
		System.out.println(b);
		
		//byte b2 = 1000; //1000已经超过-128~127
		//System.out.println(b2);
		
		short s = 1314;
		System.out.println(s);
		
		int i = 19280;
		System.out.println(i);
		
		//long l = 214748364899;//由于Java中默认整数类型是int，所以编译器此时还是把这个数当成int来检测，这个数超出int范围
		long l = 214748364899L;//在整数末尾加上一个 L ，会被看成长整型，在编译的时候去long类型范围检测
		System.out.println(l);
		
	//浮点型
		float f = 3.1415f;//在小数末尾加上一个 f ，会被看成float类型，在编译是会按float类型的范围检测
		//float f = 3.14;//由于Java中默认类型是double，此时3.14是double无法自动转换成float类型
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
	
	//字符型
		char ch = '8';
		System.out.println(ch);
		
		char ch2 = '男';
		System.out.println(ch2);
		
	//布尔类型
		boolean b1 = true;//只能给true或者false
		System.out.println(b1);
		
		boolean b2 = false;
		System.out.println(b2);
		
	}   
} 