/*
	逻辑运算符
		参与逻辑运算符运算的表达式都是布尔表达式（true/false）
		最终运算结果也一定是布尔类型
	&&：与（并且）
		两者同时满足，运算的最终结果才为 真
		全真 才为 真 ；有假 即为 假
	||：或（或者）
		两者满足其一，运算的最终结果即为 真
		有真 即为 真 ；全假 才为 假
	! ：非（取反）
		 !true == false !false == true

*/

public class OperatorDemo05
{
	public static void main (String[] args)
	{
		//&&运算符
		System.out.println(5>3 && 4>3);//true && true == true
		System.out.println(5>6 && 4>3);//false && true == false 
		System.out.println(4>3 && 5>6);//true && false == false
		System.out.println(5>6 && 3>4);//false && false == false
		System.out.println("");
		
		//||运算符
		System.out.println(5>3 || 4>3);//true || true == true
		System.out.println(5>6 || 4>3);//false || true == true 
		System.out.println(4>3 || 5>6);//true || false == true
		System.out.println(5>6 || 3>4);//false || false == false
		System.out.println("");
		
		//!运算符
		int a = 10;
		int b = 4;
		System.out.println(!(a>b));//false
		System.out.println(!(a<b));//true
		
	}
}