/*
	���������
		++�����������
			++a��ǰ�����������������������ʹ��
			a++���������������������ʹ�ú�����
		--���Լ������
*/

public class OperatorDemo02
{
	public static void main (String[] args)
	{
		//++�����
		int a = 3;
		int b = ++a;//��������Ȼ���ٰ�a��ֵ����b  �൱�� a = a+1
		System.out.println("b="+b);//b=4
		System.out.println("a="+a);//a=4
		
		int m = 10;
		int n = m++;//�Ȱ�m��ֵ����n��Ȼ��������
		System.out.println("m="+m);//m=11
		System.out.println("n="+n);//n=10
	}
}