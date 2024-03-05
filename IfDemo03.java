/*
	if的第三种结构
	格式
		if （布尔表达式）
		{
			
		}
		else （布尔表达式）
		{
			
		}
		......还可以有else if （）
		else
		{
			
		}
		如果有else，则一定有对应的if
*/

import java.util.Scanner;

public class IfDemo03
{
	public static void main (String[] args)
	{
		//[0,60]差  [60,70]中 [70,80]良 [80,100]优
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入一个成绩：");
		int score = scan.nextInt();
		
		if(score >= 0 && score < 60)
		{
			System.out.print("差");
		}
		else if ( score < 70)
		{
			System.out.print("中");
		}
		else if ( score < 80)
		{
			System.out.print("良优");
		}
		else if ( score < 100)
		{
			System.out.print("优");
		}
	}
}