/*
	Ϊ����߸�����
	������ƴ���㷨��д��һ���÷���
*/

public class ArrayDemo03
{
	public static void main (String[] args)
	{
		int[] arr = {11 , 33 , 44 , 22 , 55};
		
		String str = getArr(arr);
		
		System.out.print(str);
	}
	
	/*
		�仯����
			����ӡ�������ǲ��̶��ģ��Ͱ�������Ϊ�β�
		һ���ڷ����о�����ֻ���һ�����󣬾�����Ҫ�����һ��
	*/
	public static String getArr(int[] arr)
	{
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
		
		return str;
		
	}
}