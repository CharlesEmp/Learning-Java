/*
常量分类：
    1.整数常量
      由0-9组成的任意位数的数字
    2.小数常量
	  含有小数点
	3.布尔常量
	  true false
	4.字符常量
	  由单引号‘’括起来的 单个 字符
	5.字符串常量
	  由双引号“”括起来的 任意多个 字符
*/
public class ConstantDemo
{
	public static void main (String[] args)
	{
		//正数常量
		System.out.println(6666);//println（print line）打印数据在末尾换行
		System.out.println(2333);
		//小数常量
		System.out.println(3.1415926);
		System.out.println(3.000);
		//布尔常量
		System.out.println(true);
		System.out.println(false);
		//字符常量
		System.out.println('a');
		System.out.println('A');
		/*System.out.println('Hello');//报错 编译失败*/
		System.out.println('9');
		System.out.println('*');
		/*System.out.println('');//报错 单引号不允许空字符*/
		System.out.println('男');
		//字符串常量
		System.out.println("你好吗？");
		System.out.println("88888888");
		System.out.println("1.414");
		System.out.println("");//允许有 空字符串 常量，但不允许有 空字符 常量
	}
}