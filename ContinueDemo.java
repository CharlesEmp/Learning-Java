/*
	Continue��
		1. ֻ������ѭ����
		2. һ������continue��ֱ����ֹѭ����ִ���´�ѭ����������
*/

public class ContinueDemo
{
	public static void main (String[] args)
	{
		int sum = 0;
		for (int i = 0 ; i <= 6 ; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println("i=" + i);
				continue;//��ֹ����ѭ���������´�ѭ��
			}
			sum = sum + i;
		}
		System.out.println("sum=" + sum);
		
	}
}