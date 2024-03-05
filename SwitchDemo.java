/*
	switch：多分支选择结构
	格式：
		switch(表达式)//类型必须为 byte、short、char、int、enum（枚举）、String（字符串）
		{
			case 常量1:
				 语句;
				 break;
			case 常量2:
				 语句;
				 break;
			......
			default:
				 语句;
			     break;
		}
	根据表达式的运算结果，匹配对应的case常量。如果匹配就执行后续语句
	当所有case都不匹配，则执行default后语句
	当匹配case后常量，执行case后语句，直到遇到break才会终止执行switch
*/

import java.util.Scanner;

public class SwitchDemo
{
	public static void main (String[] args)
	{
		//判定星期的案例
		Scanner scan = new Scanner(System.in);
		int weekDay = scan.nextInt();
		
		switch (weekDay)
		{
			case 1 :
				System.out.println("星期一");
				break;
			case 2 :
				System.out.println("星期二");
				break;
			case 3 :
				System.out.println("星期三");
				break;
			case 4 :
				System.out.println("星期四");
				break;
			case 5 :
				System.out.println("星期五");
				break;	
			case 6 :
				System.out.println("星期六");
				break;	
			case 7 :
				System.out.println("星期七");
				break;
			default :
				System.out.println("请输入1-7的数字");
				break;
		}
		
	}
}