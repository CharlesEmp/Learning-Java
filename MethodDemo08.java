/*
	�������͵�ֵ���ݣ�
		���������ڴ���ֵ��ʱ�򣬴��ݵ��ǵ�ֵַ
		���βεĸı��Ӱ��ʵ�Σ�
*/

public class MethodDemo08
{
	public static void main (String[] args)
	{
		int[] arr = {3 , 6 , 11};
		method(arr);
		for (int i = 0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i]);//3 13 11
		}
	}
	
	
	public static void method(int[] arr)
	{
		arr[1] = 13;
		
	}
}