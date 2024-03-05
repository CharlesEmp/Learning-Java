/*
	for循环结构
	格式：
		for(声明变量（初始化） ; 布尔表达式 ; 步进表达式)
		{
			
		}
*/

public class ForDemo
{
	public static void main (String[] args)
	{ 
		/*
			for的执行逻辑：
				1. int i = 0
				2. 判断i<3 布尔结果为true，则进入for循环
				3. 打印i的值 0
				4. 执行步进 i++ ， i = 1
				5. 判断i<3 布尔结果为true，则进入for循环
				6. 打印i的值 1
				7. 执行步进 i++ ， i = 2
				8. 判断i<3 布尔结果为true，则进入for循环
				9. 打印i的值 2
				10.执行步进 i++ ， i = 3
				11.判断i<3 布尔结果为false，则跳出for循环
		*/
		for (int i = 0 ; i < 3 ; i++)
		{
			System.out.println(i);
		}
		
		//System.out.println(i);//因为 int i 是在for循环内声明的，i的作用域仅在for的循环中，不能使用i的值
		
		int a = 0;//提升a的作用域，从声明位置到main结束
		for ( ; a < 3 ; a++)
		{
			System.out.println(a);
		}
		System.out.println(a);
	}
}