/*
	����ĵڶ��ֶ����ʽ �������� ����ľ�̬��ʼ��
		��������[] ������ = {����Ԫ��1,����Ԫ��2,......}
*/

public class ArrayDemo03
{
	public static void main (String[] args)
	{
		//����һ������
		int[] arr = { 25 , 37 , 48 };
		
		System.out.println(arr);//����ĵ�ֵַ [I@28a418fc
		System.out.println(arr[0]);//25
		System.out.println(arr[1]);//37
		System.out.println(arr[2]);//48
		
		arr[2] = 100;
		
		System.out.println(arr[0]);//25
		System.out.println(arr[1]);//37
		System.out.println(arr[2]);//100
		
	}
}