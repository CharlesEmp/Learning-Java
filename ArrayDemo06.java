/*
	��������ֵ�����ֵ������Сֵ��
		��֪һ�����飺int[] arr = { 100 , 12 , 75 , 103 , 1 }
		�������������ֵ���㷨��˼�룩�ҳ����ֵ
*/

public class ArrayDemo06
{
	public static void main (String[] args)
	{
		int[] arr = { 100 , 12 , 75 , 103 , 1 };
		int max = arr[0];
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
			System.out.println("��" + i + "�αȽϣ��ϴ�ֵ�ǣ�" + max);
		}
		System.out.println("���ֵ�ǣ�" + max);
		
	}
}