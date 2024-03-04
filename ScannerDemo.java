/*
	Scanner运算符
		主要用Scanner来获取 键盘输入 的数据
	引用数据类型使用的一般格式：
		引用类型 变量名 = new 引用类型（）;
	使用的一般步骤：
	1.导包（导入Scanner）
	2.套用引用数据类型的格式
	3.调用引用类型中的功能
		nextInt()：只能从键盘接收 整数
		next()： 接收键盘的 字符串
	
*/

import java.util.Scanner;//为了导入 Scanner类 便于编译器找到Scanner类
						 // java.util.Scanner是为了编译器去 java/util文件夹 内找 Scanner.class 类
public class ScannerDemo
{
	public static void main (String[] args)
	{
		//套用
		Scanner scan = new Scanner(System.in);//System.in 关联键盘（让Scanner扫键盘输入的数据）
		
		//调用
		int i = scan.nextInt();//scan.nextInt()会等待用户从键盘输入数据
							   //将 用户输入的值 赋值给 i
		System.out.println("i="+i);//i=4
		
		System.out.println("");
		
		//调用接收字符串的功能
		String str = scan.next();//接收 字符串
		System.out.println("str="+str);
		
		
	}
}