/*
	����������ϰ��
		�����޷���ֵ�޲����ķ��������ӡ3�У�ÿ��3��*�ŵľ���
		�����޷���ֵ�в����ķ��������ӡָ��n�У�ÿ��n��*�ŵľ���
		�����з���ֵ�޲����ķ����������¼��õ�һ������
		�����з���ֵ�в����ķ�����������������ƽ��ֵ
	
	���������һ����ɣ�
		1.ʲôʱ���巽�����βΣ���������
			�������Ĺ��ܺ��б仯������ʱ�򣬰ѱ仯����Ϊ�������βζ���
				���ӡm��n��ʱ��  m��n��ֵ��ȷ��  ����mn��Ϊ�β�
			�������Ĺ��ܲ����仯������ʱ�򣨹̶�ֵ��������Ҫ�����β�
		
		2.ʲôʱ���巽���ķ���ֵ�����ͣ���
			�������е��߼��漰�����㣨��ֵ������Ҫ��ȡ���������ѷ���ֵ���Ͷ��������������
			�������в����߼����㣨��ӡ��䣩����Ҫ�����������������ѷ���ֵ���Ͷ���Ϊvoid
			
*/

import java.util.Scanner;
public class MethodDemo04
{
	public static void main (String[] args)
	{
		print01();
				
		print02(5 , 4);
		print02(2 , 3);
		
		int j = input();
		System.out.println(j);
		System.out.println();
		
		System.out.println(avg(12 , 13 , 14));
	}
	
	//�����޷���ֵ�޲����ķ��������ӡ3�У�ÿ��3��*�ŵľ���
	public static void print01 ()
	{
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//�����޷���ֵ�в����ķ��������ӡָ��m�У�ÿ��n��*�ŵľ���
	public static void print02(int m , int n)
	{
		for(int i = 0 ; i < m ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//�����з���ֵ�޲����ķ����������¼��õ�һ������
	public static int input()
	{
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		return i;
	}
	
	//�����з���ֵ�в����ķ�����������������ƽ��ֵ
	public static double avg(double i , double j , double k)
	{
		double x = (i + j + k) / 3;
		return x;
	}
}