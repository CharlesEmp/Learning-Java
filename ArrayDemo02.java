/*
	����Ķ����ʽ
		1.��һ�ֶ����ʽ �������� ����Ķ�̬��ʼ��
			��������[] ������ = new ��������[����ĳ��ȣ�������];
			
	JVM�ڴ滮�֣�
		ջ������ŷ����������еľֲ����������ŷ�������ջ����ջ
			  �ֲ�������������main�еı���
		������new �����Ķ���
		
	16���ƣ�0-9 A-F ��ͨ����Щ���ֺ���ĸ�����ʮ����������
		һ�������ڴ��ֵַ
		���� ��3AF 4C 0x72 ��0x��ʾʮ����������
		
	�����ʹ�÷�ʽ��
		��ʽ�� 
			ȡֵ��ʽ��������[����ռ���(����)]
			��ֵ��ʽ��������[����]=ֵ
			
*/

public class ArrayDemo02
{
	public static void main (String[] args)
	{
		//1.����һ������
		int[] arr = new int[3];//�൱��������һ������Ϊarr������
							   //�൱��һ����������3����������������
		
		System.out.println(arr);//[I@28a418fc �൱�ڴ�ӡ������ĵ�ַ
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//0
		System.out.println(arr[2]);//0
		
		arr[1] = 13;
		
		System.out.println(arr[0]);//0
		System.out.println(arr[1]);//12
		System.out.println(arr[2]);//0
		
	}
}