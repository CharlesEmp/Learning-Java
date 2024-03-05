/*
	break关键字
		1. 使用位置：循环中 或者 switch中
		2. 作用：    循环中     终止循环
					  switch中  终止switch
		3. 循环中 break 下方不可写语句，任何语句都不执行 且 报错
*/

public class BreakDemo
{
	public static void main (String[] args)
	{
		/*执行逻辑：
			1. int i=0
			2. 判断 i<=3 结果为true，执行for循环语句
			3. 进入if循环，判断 i==2，结果为false，跳出if循环语句
			4. 打印 0
			5. i++ i=1
			6. 判断 i<=3 结果为true，执行for循环语句
			7. 进入if循环，判断 i==2，结果为false，跳出if循环语句
			8. 打印 1
			9. i++ i=2
			10.判断 i<=3 结果为true，执行for循环语句
			11.进入if循环，判断 i==2，结果为true，执行if循环语句
				输出 i= 2 ；
				执行break语句 （跳出循环）
		*/
		for (int i = 0 ; i <= 3 ; i++)
		{
			if(i == 2)
			{
				System.out.println("i=" + i);
				break;
			}
			System.out.println(i);
		}
		
	}
}