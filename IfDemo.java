/*
	If选择结构的第一种格式
	格式：
		if （布尔表达式）//布尔表达式为true才继续执行{}内的
		{
			代码
		}
*/

public class IfDemo
{
	public static void main (String[] args)
	{
		int score = 60;
		if (score > 90)
		{
			score++;
		}
		System.out.println(score);
	}
}