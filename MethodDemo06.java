/*
	重载（overload）的条件：
		1.构成重载的方法，方法名必须相同
		2.构成重载的方法，形参列表必须不同
			①个数不同（a和b）
			②类型不同（a和b和c）
			③类型顺序不同（c和d） 
		3.重载与返回值无关
*/

public class MethodDemo06
{
	public static void main (String[] args)
	{
		
	}
	
	/*a*/public static void method (int i){}
	/*b*/public static void method (int i , int j){}
	/*c*/public static void method (int i , double j){}
	/*d*/public static void method (double j , int i){}
}