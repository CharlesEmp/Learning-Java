/*
	break�ؼ���
		1. ʹ��λ�ã�ѭ���� ���� switch��
		2. ���ã�    ѭ����     ��ֹѭ��
					  switch��  ��ֹswitch
		3. ѭ���� break �·�����д��䣬�κ���䶼��ִ�� �� ����
*/

public class BreakDemo
{
	public static void main (String[] args)
	{
		/*ִ���߼���
			1. int i=0
			2. �ж� i<=3 ���Ϊtrue��ִ��forѭ�����
			3. ����ifѭ�����ж� i==2�����Ϊfalse������ifѭ�����
			4. ��ӡ 0
			5. i++ i=1
			6. �ж� i<=3 ���Ϊtrue��ִ��forѭ�����
			7. ����ifѭ�����ж� i==2�����Ϊfalse������ifѭ�����
			8. ��ӡ 1
			9. i++ i=2
			10.�ж� i<=3 ���Ϊtrue��ִ��forѭ�����
			11.����ifѭ�����ж� i==2�����Ϊtrue��ִ��ifѭ�����
				��� i= 2 ��
				ִ��break��� ������ѭ����
		*/
		for (int i = 0 ; i <= 3 ; i++)
		{
			if(i == 2)
			{
				System.out.println("i=" + i);
				break;
			}
			System.out.println(i);
		}
		
	}
}