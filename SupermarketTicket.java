/*
	���й���СƱ������
		1.ʵ����Ʒ����Ϣ�����ƣ����ۣ�����������¼��
		2.չʾ��Ʒ�������Ϣ�����������ۣ���
		3.ͳ����Ϣ���������ܽ��...��
*/

import java.util.Scanner;

public class SupermarketTicket
{
	public static void main (String[] args)
	{
		//ʵ����Ϣ¼��
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��¼���һ����Ʒ�����ƣ�");
		String goodsName1 = scan.next();
		System.out.print("��¼���һ����Ʒ��������");
		int goodsQuantity1 = scan.nextInt();
		System.out.print("��¼���һ����Ʒ�ĵ��ۣ�");
		double goodsPrice1 = scan.nextDouble();
		System.out.println("��һ����Ʒ¼��ɹ���");
		
		System.out.print("��¼��ڶ�����Ʒ�����ƣ�");
		String goodsName2 = scan.next();
		System.out.print("��¼��ڶ�����Ʒ��������");
		int goodsQuantity2 = scan.nextInt();
		System.out.print("��¼��ڶ�����Ʒ�ĵ��ۣ�");
		double goodsPrice2 = scan.nextDouble();
		System.out.println("�ڶ�����Ʒ¼��ɹ���");
		
		System.out.print("��¼���������Ʒ�����ƣ�");
		String goodsName3 = scan.next();
		System.out.print("��¼���������Ʒ��������");
		int goodsQuantity3 = scan.nextInt();
		System.out.print("��¼���������Ʒ�ĵ��ۣ�");
		double goodsPrice3 = scan.nextDouble();
		System.out.println("��������Ʒ¼��ɹ���");
		
		System.out.println(" ");
		
		
		//չʾ��Ʒ��Ϣ
		System.out.println("*********��ӭ������ͤ����*********");
		System.out.println("----------------------------------");
		System.out.println("��Ʒ����      ����    ����    ���");
		
		double goodsAmount1 = goodsPrice1 * goodsQuantity1;
		double goodsAmount2 = goodsPrice2 * goodsQuantity2;
		double goodsAmount3 = goodsPrice3 * goodsQuantity3;
		
		System.out.println(goodsName1 + "            " + goodsQuantity1 + "      " + goodsPrice1 + "     " + goodsAmount1);
		System.out.println(goodsName2 + "            " + goodsQuantity2 + "      " + goodsPrice2 + "     " + goodsAmount2);
		System.out.println(goodsName3 + "            " + goodsQuantity3 + "      " + goodsPrice3 + "     " + goodsAmount3);
		
		
		//��Ʒͳ����Ϣ
		System.out.println("----------------------------------");
		
		int goodsTotalQuantity = goodsQuantity1 + goodsQuantity2 + goodsQuantity3;//��������Ʒ���������
		System.out.println("��Ʒ��������" + goodsTotalQuantity);
		double goodsTotalAmount = goodsAmount1 + goodsAmount2 + goodsAmount3;//��������Ʒ�Ľ�����
		System.out.println("��Ʒ�ܽ�" + goodsTotalAmount);
		
		//������������10�� ���� �ܽ�����100�������ܼ۵Ļ����ϴ�����
		double discountAmount = (goodsTotalQuantity > 10 || goodsTotalAmount > 100) ? goodsTotalAmount * 0.5 : 0;
		System.out.println("���Żݽ�" + discountAmount);
		double actualAmount = goodsTotalAmount - discountAmount;
		System.out.println("ʵ����" + actualAmount);
		System.out.println(" ");
		
	}	
}