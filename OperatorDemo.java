/*
	算数运算符：
	+：做加法运算  以及可以用来拼接字符串
	-：做减法运算
	*：做乘法运算
	%：做除法运算   
	/:做取模运算（取余数）
*/
public class OperatorDemo
{
	public static void main (String[] args)
	{
		//+运算符
		int a = 3;
		int b = 10;
		System.out.println(a+b);//分别取出a和b的值做加法运算
		
		double c = 3.5;
		System.out.println(a+c);//不同类型做运算的时候会先把范围小的类型转换为范围大的类型再运算
		
		//+可以用来连接字符串
		System.out.println("你"+"好"+"帅");//"你好帅"
		
		System.out.println("5+5="+5+5);//“5+5=55”
		System.out.println("5+5="+(5+5));//先算小括号
		System.out.println(5+5+"=5+5");
		
		//-运算符
		int d = 3;
		int e = 5;
		System.out.println(d-e);
		
		//*运算符
		int f = 2;
		double g = 0.5;
		System.out.println(f*g);//最终结果类型是范围大的类型
		
		//%运算符 和 /运算符
		int i1 = 5;
		int i2 = 2;
		System.out.println(i1/i2);//2
								  //两个int做运算，结果一定是int
								  //“/”计算的是两个数的 商
		System.out.println(i1%i2);//1
								  //计算两个数相除的 余数
		int number = 47;
		System.out.println(number%10);//7 得到个位数
		System.out.println(number/10);//4 得到十位数
		
	}	
}