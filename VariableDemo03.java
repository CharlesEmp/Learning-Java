/*
 ����������ת��
	1.�Զ�����ת�������ݷ�Χ�ĴӶൽ�٣�
		byte -> short -> int -> long -> float -> double
	2.ǿ������ת��
		byte <- short <- int <- long <- float <- double
		
		�������� ������ = ��Ҫǿ��ת�������ͣ�ֵ;
*/
	
public class VariableDemo03
{
	public static void main (String[] args)
	{
		//�Զ�����ת��
		int i = 13;
		double d = i;//��i������ֵ��ֵ��d����(�Ὣi��int�����Զ�ת��double)
		System.out.println(i);//13
		System.out.println(d);//13.0
		
		//ǿ������ת��
		//float f = 3.5;//float <- double
		float f = (float)3.5;
		System.out.println(f)//3.5;
		
		double d2 = 7.5;
		int j = (int)d2;
		System.out.println(j)//7;
		
	}
	
}