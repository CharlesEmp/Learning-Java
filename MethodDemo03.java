/*
	������ע������;
		1.�������������к������������У����ܷ����׷��� ���������������������⡿
		2.�����β��϶���ı�������������ڷ�����
		3.���ܶ���������ȫ��ͬ�ķ���
		4.����õķ������Է���ʹ�ã���ߴ���ĸ�����
		5.���÷������ε�ʱ��֧�����͵��Զ�����
		6.�������ֵ����Ϊvoid����returnֵ��Ҳ����ֱ�Ӵ�ӡ
		7.�������ֵ���Ͳ���void����ֱ�Ӵ�ӡ
		8.�����������ֵ���Ͳ���void����Է���ֵ���ǿ��Ի�ȡҲ���Բ���ȡ

*/

public class MethodDemo03
{
	public static void main (String[] args)
	{
		//��
		method05(4.3);
		method05(5);
		
		//�ޣ���
		int m = method07(10);
		System.out.println(m);
		
		System.out.println(method07(10));
		//System.out.println(method05(5.2));//�������˴�������ʹ�� '��' ����
		
		//��
		method07(12);
	}
	
//������������������������������������������������������������������������������������������������������������������������������������	
	
	
	//��
	public static void method05 (double d)//double d = 5;//���Դ�int�Զ�ת����double
	{
		System.out.println(d);
	} 
	
	//��
	public static void method06a (int i , int j)
	{
		System.out.println(i+j);
		//return i;//�����������ݵ�����: ����ķ���ֵ
				   //���ܷ����κ�ֵ����Ϊ�����ϵķ���������void
		return;//��ֹ����
	}
	public static int method07 (int i)
	{
		return i;
	}
}