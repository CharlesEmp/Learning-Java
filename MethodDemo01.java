/*
	方法：为了完成某件事情儿采用的解决步骤（方案）
		例：买衣服：选线下商店
					进入商店
					挑选试穿
					结账
					装袋 带走
	方法的定义格式：
		修饰符 返回值类型 方法名 (变量类型1 变量名1 , 变量类型2 变量名2 , ......)
		{
			//方法步骤语句
			//return 返回值;
		}
		
			修饰符     ：public static
			返回值类型 ：基本类型（四类八种）或引用类型  void：只在方法的返回值类型上用
			方法名     ：遵循标识符的其明规则，方法名一边规范：xxxXxxXxx（首个单词纯小写，其余单词首字母大写）
			小括号内声明的变量 ————> 形参列表
		
	方法的使用格式：
		方法名（值1 ， 值2 ， 值3 ，....）;
*/

public class MethodDemo01
{
	public static  void     main      (String[] args)
	//修饰符     返回值   方法名  类型声明(字符串类型数组)
	
	{
		int getArea = getArea(3 , 4);
		System.out.println(getArea);
	}
	
	
	//求长方形面积的案例：长*宽
	public static int getArea (int length , int width)
	     //返回值类型与return类型一样
	{
		int area = length * width;
		return area;
	}
	/*
		1.main方法入栈
		2.开始执行int getArea
		3.getArea(3,4)根据方法名和值的类型确定方法（getArea(int int)）
		4.将3，4值分别赋给对应变量length 和 width
		5.执行getArea语句
		6.return返回语句（返回到调用位置）
		7.getArea语句执行完会在栈中销毁
		8.返回getArea
		9.int getArea = 12
		10.打印12
	*/ 
}