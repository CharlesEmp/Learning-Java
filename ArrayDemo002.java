/*
	2.1�����ӡ����Ԫ�ط���
	���ո����ĸ�ʽ��ӡ[11��33��44,22��55].
	
	�����ַ���ƴ��˼��
		1.�ַ����洢"["		//String str = "["
		2.�����ַ���ƴ������Ԫ��
		3.�ַ����洢"]"		//String str = "]"
*/

public class ArrayDemo02
{
	public static void main (String[] args)
	{
		int[] arr = {11 , 33 , 44 , 22 , 55};
		
		//�����ַ�������
		String str = "[";
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(i == (arr.length - 1))
			{
				str = str + arr[i];
			}
			else
			{
				str = str + arr[i] + ", ";
			}
		}
		
		str = str + "]";
		
		System.out.print(str);
		
	}
}