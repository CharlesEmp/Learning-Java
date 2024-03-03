/*
	比较运算符：(最终的运算结果，非true即false)
		==：等号运算符
		!=：不等号运算符
		>=：大于等于运算符
		<=：小于等于运算符
*/

public class OperatorDemo04
{
	public static void main (String[] args)
	{
		//=与==区别
		//=：从右往左赋值
		//==；判断左右表达式的值是否相同，相同为true，不同为false
		int a = 3;
		int b = 7;
		System.out.println(a = b);//7
								  //a = 7, b = 7
		System.out.println(a == b);//true
		//!=运算符
		int c = 10;
		double d = 10.0;
		System.out.println(c != d);//false
		
		//>运算符
		System.out.println(10>6);//true
		
		//>=运算符（满足 大于 或 等于 其中之一，结果就为真）
		System.out.println(6>=6);//true
		System.out.println(7>=2);//true
		System.out.println(5>=10);//false
		
		
	}
}