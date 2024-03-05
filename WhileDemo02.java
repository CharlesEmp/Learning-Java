/*
	利用while循环完成输出10次“我爱java”
	分析：
		1.找出要被重复的语句
			System.out.println("我爱Java" + i);
		2.把重复语句放入while循环
		3.将while循环执行次数控制执行10次
*/

public class WhileDemo02
{
	public static void main (String[] args)
	{
		int i = 0;
		while (i <= 9)
		{
			i++;
			System.out.println("我爱Java" + i);
		}
		
	}
}