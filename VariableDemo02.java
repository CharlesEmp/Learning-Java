/*
变量的一些常见问题：
	1.变量可以先定义再赋值，如果变量如果使用，必须赋值
	2.变量有使用范围（作用域），如果超出使用范围，则不能使用该变量
	  如何确定变量的作用范围：
		①首先找定义的变量所在的{}（就近的{}中间）
		②从当前这个变量的声明位置开始一直到大括号结束代表变量的作用范围
		 在这个作用范围直接可以使用这个变量
	3.在一个变量的作用域范围内，不能再声名同名变量
	4.变量一旦定义，可以反复使用
	
*/

public class VariableDemo02
{
	public static void main (String[] args)
	{
		//变量可以先定义再赋值
		/*int i = 3;
		System.out.println(i);*/
		int i;//先定义变量
		i = 87;//再给变量赋值
		System.out.println(i);
		
		/*int j;
		System.out.println(j);//如果变量未赋值，则不能使用*/
		
		//变量有使用范围
		//System.out.println(m);//错误：不在m的作用域中
		int m = 654;
		{
			int n =789;
			System.out.println(m);
			System.out.println(n);
		}
		System.out.println(m);
		//System.out.println(n);//错误：n超出了变量n的范围
		
		//在变量作用域范围内不能声明同名变量
		double d = 3.14;
		{
			//double d = 5.52;//不能与上面的d重名，会报错。
			System.out.println(d);//如果可以重名，编译器无法识别使用哪个d。而且编译器不允许重名。
		}
		System.out.println(d);
		
		//变量可以反复使用
		char ch = '你';
		ch = '好';//‘好’会覆盖掉原来的‘你’字符
		System.out.println(ch);
		
	}
}