/*
	����������������
		1.�������Ͳ�����������
			�������͵�ֵ�Ĵ��ݣ��βεĸı䲻Ӱ��ʵ��
		2.�������Ͳ�����������
*/

public class MethodDemo07
{
	public static void main (String[] args)
	{
		int a = 10;
		method(a);
		System.out.println("a="+a);//a = 10
		//method�ж�a�ĸı䣬�ı����method��������a����main�е�aû�й�ϵ
		//�������͵�ֵ�Ĵ��ݣ��βεĸı䲻Ӱ��ʵ��
		
	}
	
	public static void method(int a)
	{
		a = a + 2;
	}
}