/*
	ð�������㷨��
			�������
		1.�Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
		2.��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�
		  ����һ�㣬����Ԫ��Ӧ�û�����������
		3.������е�Ԫ���ظ����ϵĲ��裬�������һ����
		4.����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚ�.

	������һ������{13 42 21 50 3}
*/

public class ArrayDemo004b
{
	public static void main (String[] args)
	{
		int[] arr = {13,42,21,50,3};
		
		for(int i = 0 ; i < (arr.length - 1) ; i++)
		{
			for(int j = 0 ; j < (arr.length - i - 1) ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}