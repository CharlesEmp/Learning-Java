/*
	Java�������ͷ���
		����
			byte
			short
			int��Ĭ������
			long
		������
			float
			double��Ĭ������
		�ַ���
			char��character��
		������
			boolean
	���������ʽ��
		��������	������ = ��ֵ����������һ��������
*/

public class VariableDemo
{
	public static void main (String[] args)
	{
	//����
		byte b = 13;
		System.out.println(b);
		
		//byte b2 = 1000; //1000�Ѿ�����-128~127
		//System.out.println(b2);
		
		short s = 1314;
		System.out.println(s);
		
		int i = 19280;
		System.out.println(i);
		
		//long l = 214748364899;//����Java��Ĭ������������int�����Ա�������ʱ���ǰ����������int����⣬���������int��Χ
		long l = 214748364899L;//������ĩβ����һ�� L ���ᱻ���ɳ����ͣ��ڱ����ʱ��ȥlong���ͷ�Χ���
		System.out.println(l);
		
	//������
		float f = 3.1415f;//��С��ĩβ����һ�� f ���ᱻ����float���ͣ��ڱ����ǻᰴfloat���͵ķ�Χ���
		//float f = 3.14;//����Java��Ĭ��������double����ʱ3.14��double�޷��Զ�ת����float����
		System.out.println(f);
		
		double d = 3.14;
		System.out.println(d);
	
	//�ַ���
		char ch = '8';
		System.out.println(ch);
		
		char ch2 = '��';
		System.out.println(ch2);
		
	//��������
		boolean b1 = true;//ֻ�ܸ�true����false
		System.out.println(b1);
		
		boolean b2 = false;
		System.out.println(b2);
		
	}   
} 