/*
	if�ĵ����ֽṹ
	��ʽ
		if ���������ʽ��
		{
			
		}
		else ���������ʽ��
		{
			
		}
		......��������else if ����
		else
		{
			
		}
		�����else����һ���ж�Ӧ��if
*/

import java.util.Scanner;

public class IfDemo03
{
	public static void main (String[] args)
	{
		//[0,60]��  [60,70]�� [70,80]�� [80,100]��
		Scanner scan = new Scanner(System.in);
		System.out.print("������һ���ɼ���");
		int score = scan.nextInt();
		
		if(score >= 0 && score < 60)
		{
			System.out.print("��");
		}
		else if ( score < 70)
		{
			System.out.print("��");
		}
		else if ( score < 80)
		{
			System.out.print("����");
		}
		else if ( score < 100)
		{
			System.out.print("��");
		}
	}
}