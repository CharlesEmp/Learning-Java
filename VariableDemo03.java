/*
 变量的类型转换
	1.自动类型转换（数据范围的从多到少）
		byte -> short -> int -> long -> float -> double
	2.强制类型转换
		byte <- short <- int <- long <- float <- double
		
		变量类型 变量名 = （要强制转换的类型）值;
*/
	
public class VariableDemo03
{
	public static void main (String[] args)
	{
		//自动类型转换
		int i = 13;
		double d = i;//将i变量的值赋值给d变量(会将i的int类型自动转成double)
		System.out.println(i);//13
		System.out.println(d);//13.0
		
		//强制类型转换
		//float f = 3.5;//float <- double
		float f = (float)3.5;
		System.out.println(f)//3.5;
		
		double d2 = 7.5;
		int j = (int)d2;
		System.out.println(j)//7;
		
	}
	
}