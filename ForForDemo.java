/*
	ѭ��Ƕ��
		ͨ�ø�ʽ��ѭ���ṹǶ�׿�����ѡ����
			ѭ���ṹ
			{
				ѭ���ṹ
				{
					ѭ���ṹ
					{
						
					}
				}
			}
		��forѭ��Ƕ��forѭ��Ϊ��
		for�� �� �� ��
		{
				//���
			for���� �� ����
			{
				//���
			}
			    //���
		}
*/

/*
	����System.out.print("*");
	�ڿ���̨��ӡ����ͼ��
	****
	****
	****
*/

public class ForForDemo
{
	public static void main (String[] args)
	{
		for (int a = 0 ; a < 3 ; a++)
		{
			for (int i = 0 ; i < 4 ; i++)//��ӡһ���ĸ� *
			{
				System.out.print("*");
			}
			System.out.println();//������ĩβ��һ������
		}
	}
}  