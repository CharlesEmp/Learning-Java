/*
	��ֵ�����
	  =����ֵ��
	��������
	�����еĻ������������Զ�ǿ��ת����
	  +=��
	  -=��
	  *=�� 
	  /=�� 
	  %=�� 
	
*/

public class OperatorDemo03
{
	public static void main (String[] args)
	{
		//=�����
		int a = 3 + 4;//�ȼ��㸳ֵ���ұߵı��ʽ��Ȼ���ٰѽ����ֵ����ֵ����ߵı���a
		System.out.println(a);//7
		
		//*=�����
		int b = 5; 
		b *= 7;//�൱��b = b * 7
		System.out.println(b);//35
		
		//��ֵ���������������
		byte c = 3;
		//c = c + 2;//��������c+2��byte��int�����㣬�Ȱ�byte������Ϊint������
		c = (byte)(c + 2);//ǿ��תΪbyte����
		System.out.println(c);//5
		
		byte d = 10;
		d += 2;
		System.out.println(d);//12
	}
}