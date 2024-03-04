/*
	三元运算符
		格式
			布尔表达式 ? 表达式1 :表达式2 ;
		如果布尔表达式结果为 true 则执行表达式1
		如果布尔表达式结果为 false 则执行表达式2
*/

public class OperatorDemo07
{
	public static void main (String[] args)
	{
		//三元运算符
		System.out.println(3>2 ? "大" : "小");//大
		
		int a = 10;
		int b = 30;
		boolean c = a >= b ? true : false;
		System.out.println(c);//false
		
	}
}