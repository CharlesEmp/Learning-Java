/*
	����ı���
	
*/

public class ArrayDemo04
{
	public static void main (String[] args)
	{
		double[] arr = { 32.2 , 45.4 , 62.7 , 99.5 };
		
		//��������е�Ԫ�غܶ࣬��Ҫ�ظ�д�ܶ��ȡֵ���ܷ���
		System.out.println(arr[0]);//32.2
		System.out.println(arr[1]);//45.4
		System.out.println(arr[2]);//62.7
		System.out.println(arr[3]);//99.5
		System.out.println("");
		
		for (int i = 0 ; i < arr.length ; i++)//��i��0�䵽3���������δ�ӡ�����е�Ԫ��
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
}