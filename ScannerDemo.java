/*
	Scanner�����
		��Ҫ��Scanner����ȡ �������� ������
	������������ʹ�õ�һ���ʽ��
		�������� ������ = new �������ͣ���;
	ʹ�õ�һ�㲽�裺
	1.����������Scanner��
	2.���������������͵ĸ�ʽ
	3.�������������еĹ���
		nextInt()��ֻ�ܴӼ��̽��� ����
		next()�� ���ռ��̵� �ַ���
	
*/

import java.util.Scanner;//Ϊ�˵��� Scanner�� ���ڱ������ҵ�Scanner��
						 // java.util.Scanner��Ϊ�˱�����ȥ java/util�ļ��� ���� Scanner.class ��
public class ScannerDemo
{
	public static void main (String[] args)
	{
		//����
		Scanner scan = new Scanner(System.in);//System.in �������̣���Scannerɨ������������ݣ�
		
		//����
		int i = scan.nextInt();//scan.nextInt()��ȴ��û��Ӽ�����������
							   //�� �û������ֵ ��ֵ�� i
		System.out.println("i="+i);//i=4
		
		System.out.println("");
		
		//���ý����ַ����Ĺ���
		String str = scan.next();//���� �ַ���
		System.out.println("str="+str);
		
		
	}
}