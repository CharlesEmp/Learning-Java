/*
	�������
		������֪һ���������飬�������ĸ�Ԫ�أ���Ҫ�������������Ԫ�صĺ�
		���磺int[] arr = { 13 , 15 , 12 , 17 };
				13 + 15 + 12 + 17
*/

public class ArrayDemo05
{
	public static void main (String[] args)
	{
		int[] arr = { 13 , 15 , 12 , 17 };
		int sum = 0 ;
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum = sum + arr[i];
			/*
				��һ��ѭ����sum = 0 + arr[0] = 0 + 13 = 13
				�ڶ���ѭ����sum = 13 + arr[1] = 13 + 15 = 28
				������ѭ����sum = 28 + arr[2] = 28 + 12 = 40
				���Ĵ�ѭ����sum = 40 + arr[3] = 40 + 57 = 57
			*/
		}
		System.out.println("sum="+sum);//57
		
	}
}