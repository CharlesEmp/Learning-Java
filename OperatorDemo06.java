/*
	&&和||的注意事项
		&&：又名 短路与
			运算中布尔表达式一旦有false，则不再继续运算，直接得出结果 false
		||：又名 短路或
			运算中布尔表达式一旦有true，则不再继续运算，直接得出结果 true
*/

public class OperatorDemo06
{
	public static void main (String[] args)
	{
		//&&注意事项
		int a = 3;
		boolean b = true && ++a>2;//由于先为true，则继续运行++a
		System.out.println("a="+a);//4
		System.out.println("b="+b);//true
		
		int c = 4;
		boolean d = false && ++c>5;//由于先为false，则不再运行++c
		System.out.println("c="+c);//4
		System.out.println("d="+d);//false
		
		//||注意事项
		int m = 3;
		boolean n = true && ++m>2;//由于先为true，则不再计算++m
		System.out.println("m="+m);//3
		System.out.println("n="+n);//true
		
		int j = 4;
		boolean k = false && ++j>5;//由于先为false，则继续运行++j
		System.out.println("j="+j);//4
		System.out.println("k="+k);//true
		
	}
}