/*
	2.1�����ӡ����Ԫ�ط���
	���ո����ĸ�ʽ��ӡ[11��33��44,22��55].
	
	������һ������
		int arr = [11 , 33 , 44 , 22 , 55]
	1.��ӡ��ʽ�ص� 
		�ڵ�һ��Ԫ���������һ��[
		���Ŵ�ӡ������Ԫ�أ�ÿ��Ԫ��֮���� ���� �ո� ����
		���һ��Ԫ�����ұ���һ��]
	2.����abc������ʵ��
*/

public class ArrayDemo01
{
	public static void main (String[] args)
	{
		// 1.����һ������
		int[] arr = {11 , 33 , 44 , 22 , 55};
		
		//����ָ����ʽȥ��ӡ
		System.out.print("[");
		
		//��ӡ����Ԫ��
		//����ı���
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(i == (arr.length - 1))//���һ��Ԫ��
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i] + ", ");
			}
		}
		
		//��������
		System.out.print("]");
		
	}
}