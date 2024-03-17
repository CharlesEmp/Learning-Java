/*
	方法参数传递问题
		1.基本类型参数传递问题
			基本类型的值的传递，形参的改变不影响实参
		2.引用类型参数传递问题
*/

public class MethodDemo07
{
	public static void main (String[] args)
	{
		int a = 10;
		method(a);
		System.out.println("a="+a);//a = 10
		//method中对a的改变，改变的是method上声明的a，与main中的a没有关系
		//基本类型的值的传递，形参的改变不影响实参
		
	}
	
	public static void method(int a)
	{
		a = a + 2;
	}
}