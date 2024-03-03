/*
	赋值运算符
	  =：赋值符
	混合运算符
	（所有的混合运算符都会自动强制转换）
	  +=：
	  -=：
	  *=： 
	  /=： 
	  %=： 
	
*/

public class OperatorDemo03
{
	public static void main (String[] args)
	{
		//=运算符
		int a = 3 + 4;//先计算赋值符右边的表达式，然后再把结果赋值给赋值符左边的变量a
		System.out.println(a);//7
		
		//*=运算符
		int b = 5; 
		b *= 7;//相当于b = b * 7
		System.out.println(b);//35
		
		//赋值运算符常见的问题
		byte c = 3;
		//c = c + 2;//首先运算c+2，byte与int做运算，先把byte类型升为int再运算
		c = (byte)(c + 2);//强制转为byte类型
		System.out.println(c);//5
		
		byte d = 10;
		d += 2;
		System.out.println(d);//12
	}
}