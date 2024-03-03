/*
	算数运算符
		++：自增运算符
			++a；前置自增运算符——先自增后使用
			a++：后置自增运算符——先使用后自增
		--：自减运算符
*/

public class OperatorDemo02
{
	public static void main (String[] args)
	{
		//++运算符
		int a = 3;
		int b = ++a;//先自增，然后再把a的值赋给b  相当于 a = a+1
		System.out.println("b="+b);//b=4
		System.out.println("a="+a);//a=4
		
		int m = 10;
		int n = m++;//先把m的值赋给n，然后再自增
		System.out.println("m="+m);//m=11
		System.out.println("n="+n);//n=10
	}
}