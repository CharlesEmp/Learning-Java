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

public class ArrayDemo004a
{
	public static void main (String[] args)
	{
		int[] arr = {13,42,21,50,3};
		int l = arr.length;
		for( ; l > 1 ; l--)
		{
			for(int i = 0 ; i < (l - 1) ; i++)
			{
				if(arr[i] > arr[i+1])
				{
					int a = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = a;
				}
			}
		}
		
		System.out.print("[");
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}
}