/*
	����������
		����һ�������������ĺ͵ķ���
		����һ�������������ĺ͵ķ���
		����һ��������С���ĺ͵ķ��� 
	  ������������ʵ�ֵĹ��ܣ��߼����������ƣ��������ӷ�����
	  �����������������ж��������֣����������ർ���û��ļ��为������
	  ��˰Ѿ��������ƹ��ܵķ���ʹ����ͬ�ķ�����������ʹ��
*/

public class MethodDemo05
{
	/*
	public static void main (String[] args)
	{
		System.out.println(addTwoInt(4 , 6));
		
		System.out.println(addThreeInt(3 , 7 , 9));
		
		System.out.println(addTwoDouble(3.2 , 4.5));
	}
	
	
	//����һ�������������ĺ͵ķ���
	public static int addTwoInt(int i , int j)
	{
		//int sum = i + j;
		//return sum;
		return (i + j);
	}
	
	//����һ�������������ĺ͵ķ���
	public static int addThreeInt(int i , int j , int k)
	{
		return (i + j + k);
	}

	//����һ��������С���ĺ͵ķ���
	public static double addTwoDouble(double i , double j)
	{
		return (i + j);
	}
	*/
	
	public static void main (String[] args)
	{
		System.out.println(add(4 , 6));//���ݷ����������Լ���ֵ������ȷ�����õķ���
		
		System.out.println(add(3 , 7 , 9));
		
		System.out.println(add(3.2 , 4.5));
	}
	//����һ�������������ĺ͵ķ���
	public static int add(int i , int j)
	{
		//int sum = i + j;
		//return sum;
		return (i + j);
	}
	//�������������������ع�ϵ
	//����һ�������������ĺ͵ķ���
	public static int add(int i , int j , int k)
	{
		return (i + j + k);
	}

	//����һ��������С���ĺ͵ķ���
	public static double add(double i , double j)
	{
		return (i + j);
	}
	
}