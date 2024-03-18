/*
	1.2
	所有数据在计算机中都以二进制的形式存储
	打印ASCII码的值
*/
public class ASCIIDemo
{
	public static void main (String[] args)
	{
		System.out.println('a');
		System.out.println((int)'a');//底层会根据ASCII码表将a转换成对应的十进制数
		System.out.println((int)'A');
		System.out.println((int)'0');
	}
}