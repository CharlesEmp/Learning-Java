/*
	While循环结构
	格式：
		while (布尔)
		{
			循环语句
		}
	当布尔为true，则一直执行循环  直到布尔为false，则跳出循环
*/

public class WhileDemo
{
	public static void main (String[] args)
	{
		/*
			while执行逻辑分析：
				1. int = 0;
				2. 先判断循环条件（x<=2）  若true则继续执行while内容
				3. 打印 x 的值 0
				4. 执行 x++ , 结果 x=1
				5. 判断循环条件（x<=2）  若true则继续执行while内容
				6. 打印 x 的值 1
				7. 执行 x++ , 结果 x=2
				8. 判断循环条件（x<=2）  若true则继续执行while内容
				9. 打印 x 的值 2
				10.执行 x++ , 结果 x=3
				11.判断循环条件（x<=2）  若false则 不执行while内容
				12.执行while循环外的语句，即 输出x的值 3
		*/
		int x = 0;
		
		while (x <= 2)
		{
			System.out.println(x);
			x++;
		}
		System.out.println(x);
		
	}
}