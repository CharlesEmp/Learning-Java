/*
	switch�����֧ѡ��ṹ
	��ʽ��
		switch(���ʽ)//���ͱ���Ϊ byte��short��char��int��enum��ö�٣���String���ַ�����
		{
			case ����1:
				 ���;
				 break;
			case ����2:
				 ���;
				 break;
			......
			default:
				 ���;
			     break;
		}
	���ݱ��ʽ����������ƥ���Ӧ��case���������ƥ���ִ�к������
	������case����ƥ�䣬��ִ��default�����
	��ƥ��case������ִ��case����䣬ֱ������break�Ż���ִֹ��switch
*/

import java.util.Scanner;

public class SwitchDemo
{
	public static void main (String[] args)
	{
		//�ж����ڵİ���
		Scanner scan = new Scanner(System.in);
		int weekDay = scan.nextInt();
		
		switch (weekDay)
		{
			case 1 :
				System.out.println("����һ");
				break;
			case 2 :
				System.out.println("���ڶ�");
				break;
			case 3 :
				System.out.println("������");
				break;
			case 4 :
				System.out.println("������");
				break;
			case 5 :
				System.out.println("������");
				break;	
			case 6 :
				System.out.println("������");
				break;	
			case 7 :
				System.out.println("������");
				break;
			default :
				System.out.println("������1-7������");
				break;
		}
		
	}
}