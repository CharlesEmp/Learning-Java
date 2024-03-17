/*
	方法定义练习：
		定义无返回值无参数的方法，如打印3行，每行3个*号的矩形
		定义无返回值有参数的方法，如打印指定n行，每行n个*号的矩形
		定义有返回值无参数的方法，如键盘录入得到一个整数
		定义有返回值有参数的方法，如求三个数的平均值
	
	方法定义的一般规律：
		1.什么时候定义方法的形参（变量）？
			当方法的功能含有变化的量的时候，把变化量作为方法的形参定义
				如打印m行n列时候  m和n的值不确定  所以mn作为形参
			当方法的功能不含变化的量的时候（固定值），不需要定义形参
		
		2.什么时候定义方法的返回值（类型）？
			当方法中的逻辑涉及到运算（求值）且需要获取运算结果，把返回值类型定义成运算结果类型
			当方法中不含逻辑运算（打印语句）或不需要方法返回运算结果，把返回值类型定义为void
			
*/

import java.util.Scanner;
public class MethodDemo04
{
	public static void main (String[] args)
	{
		print01();
				
		print02(5 , 4);
		print02(2 , 3);
		
		int j = input();
		System.out.println(j);
		System.out.println();
		
		System.out.println(avg(12 , 13 , 14));
	}
	
	//定义无返回值无参数的方法，如打印3行，每行3个*号的矩形
	public static void print01 ()
	{
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//定义无返回值有参数的方法，如打印指定m行，每行n个*号的矩形
	public static void print02(int m , int n)
	{
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//定义有返回值无参数的方法，如键盘录入得到一个整数
	public static int input()
	{
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		return i;
	}
	
	//定义有返回值有参数的方法，如求三个数的平均值
	public static double avg(double i , double j , double k)
	{
		double x = (i + j + k) / 3;
		return x;
	}
}