/*
	�������ͨ�����㷨��
			������ĵ�һ��λ�ÿ�ʼ������� ֱ���ҵ������ҵ�Ԫ��
			��������е�Ԫ���������Ԫ��ȫ���Աȷ��ֶ�����ͬ��˵��������Ԫ���������в�����
		��֪һ������{23��34��45��56��67��78��89}
			�����ҵ�Ԫ�أ� 56 λ�ã�3  
			�����ҵ�Ԫ�أ�100 λ�ã��Ҳ���
*/

public class ArrayDemo005
{
	public static void main (String[] args)
	{
		int[] arr = {23,34,45,56,67,78,89};
		
		int index = findIndex(arr , 67);
		
		if(index == -1)
		{
			System.out.println("δ���ҵ���Ԫ��");
		}
		else
		{
			System.out.println("����Ԫ�������ڣ�" + index);
		}
	}
	
	/*
		�����б仯����
			����
			����Ԫ��
		����ֵ����
			����λ��
	*/
	public static int findIndex (int[] arr , int key)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		//��ѭ�����꣬����˵��key�������е�Ԫ�ض��Ƚ���һ��
		//����ߵ�forѭ����˵��ûִ��return i����˵��Ԫ��δ�ҵ�
		return -1;
	}
}