/*
	���������ע������
		1.�����ָ��
			null  �ճ���  ֻ�ܸ�ֵ�������������ͣ����飩
			�������һ����ֵnull��������ô�������ͻ�Ͷ��е�����ʧȥ��ϵ���޷��ٲ��������е�Ԫ��
		2.��������Խ��
*/

public class ArrayDemo07
{
	public static void main (String[] args)
	{
		//��̬��ʼ��һ������
		int[] arr = new int[3];
		arr = null ;//arr�в��ٴ洢����ĵ�ֵַ
		System.out.println(arr[0]);//NullPointerException ��ָ���쳣
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
}