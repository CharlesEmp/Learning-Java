/*
	�����������
	+�����ӷ�����  �Լ���������ƴ���ַ���
	-������������
	*�����˷�����
	%������������   
	/:��ȡģ���㣨ȡ������
*/
public class OperatorDemo
{
	public static void main (String[] args)
	{
		//+�����
		int a = 3;
		int b = 10;
		System.out.println(a+b);//�ֱ�ȡ��a��b��ֵ���ӷ�����
		
		double c = 3.5;
		System.out.println(a+c);//��ͬ�����������ʱ����Ȱѷ�ΧС������ת��Ϊ��Χ�������������
		
		//+�������������ַ���
		System.out.println("��"+"��"+"˧");//"���˧"
		
		System.out.println("5+5="+5+5);//��5+5=55��
		System.out.println("5+5="+(5+5));//����С����
		System.out.println(5+5+"=5+5");
		
		//-�����
		int d = 3;
		int e = 5;
		System.out.println(d-e);
		
		//*�����
		int f = 2;
		double g = 0.5;
		System.out.println(f*g);//���ս�������Ƿ�Χ�������
		
		//%����� �� /�����
		int i1 = 5;
		int i2 = 2;
		System.out.println(i1/i2);//2
								  //����int�����㣬���һ����int
								  //��/����������������� ��
		System.out.println(i1%i2);//1
								  //��������������� ����
		int number = 47;
		System.out.println(number%10);//7 �õ���λ��
		System.out.println(number/10);//4 �õ�ʮλ��
		
	}	
}