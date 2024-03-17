/*
	方法的重载
		定义一个求两个整数的和的方法
		定义一个求三个整数的和的方法
		定义一个求两个小数的和的方法 
	  由于三个方法实现的功能（逻辑）都很类似，都是做加法运算
	  但是这三个方法都有独立的名字，方法名过多导致用户的记忆负担加重
	  因此把具有有相似功能的方法使用相同的方法名，来简化使用
*/

public class MethodDemo05
{
	/*
	public static void main (String[] args)
	{
		System.out.println(addTwoInt(4 , 6));
		
		System.out.println(addThreeInt(3 , 7 , 9));
		
		System.out.println(addTwoDouble(3.2 , 4.5));
	}
	
	
	//定义一个求两个整数的和的方法
	public static int addTwoInt(int i , int j)
	{
		//int sum = i + j;
		//return sum;
		return (i + j);
	}
	
	//定义一个求三个整数的和的方法
	public static int addThreeInt(int i , int j , int k)
	{
		return (i + j + k);
	}

	//定义一个求两个小数的和的方法
	public static double addTwoDouble(double i , double j)
	{
		return (i + j);
	}
	*/
	
	public static void main (String[] args)
	{
		System.out.println(add(4 , 6));//根据方法的名称以及传值的类型确定调用的方法
		
		System.out.println(add(3 , 7 , 9));
		
		System.out.println(add(3.2 , 4.5));
	}
	//定义一个求两个整数的和的方法
	public static int add(int i , int j)
	{
		//int sum = i + j;
		//return sum;
		return (i + j);
	}
	//以下三个方法构成重载关系
	//定义一个求三个整数的和的方法
	public static int add(int i , int j , int k)
	{
		return (i + j + k);
	}

	//定义一个求两个小数的和的方法
	public static double add(double i , double j)
	{
		return (i + j);
	}
	
}