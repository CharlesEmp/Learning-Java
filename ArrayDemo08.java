/*
	���������ע������
		2.��������Խ��
		  �����е�������Χ 0 ~ ��arr.length-1��
		  һ������������� �� ������ȷ������Χ�ڣ��ͻᱨ��������Խ��
*/

public class ArrayDemo08
{
	public static void main (String[] args)
	{
		//��̬��ʼ��һ������
		int[] arr = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: Index 3
								   //��������Խ���쳣 3����3����Խ��
	}
}