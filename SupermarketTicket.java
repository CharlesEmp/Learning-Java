/*
	超市购物小票案例：
		1.实现商品的信息（名称，单价，购买数量）录入
		2.展示商品购买的信息（数量，单价，金额）
		3.统计信息（总数，总金额...）
*/

import java.util.Scanner;

public class SupermarketTicket
{
	public static void main (String[] args)
	{
		//实现信息录入
		Scanner scan = new Scanner(System.in);
		
		System.out.print("请录入第一件商品的名称：");
		String goodsName1 = scan.next();
		System.out.print("请录入第一件商品的数量：");
		int goodsQuantity1 = scan.nextInt();
		System.out.print("请录入第一件商品的单价：");
		double goodsPrice1 = scan.nextDouble();
		System.out.println("第一件商品录入成功！");
		
		System.out.print("请录入第二件商品的名称：");
		String goodsName2 = scan.next();
		System.out.print("请录入第二件商品的数量：");
		int goodsQuantity2 = scan.nextInt();
		System.out.print("请录入第二件商品的单价：");
		double goodsPrice2 = scan.nextDouble();
		System.out.println("第二件商品录入成功！");
		
		System.out.print("请录入第三件商品的名称：");
		String goodsName3 = scan.next();
		System.out.print("请录入第三件商品的数量：");
		int goodsQuantity3 = scan.nextInt();
		System.out.print("请录入第三件商品的单价：");
		double goodsPrice3 = scan.nextDouble();
		System.out.println("第三件商品录入成功！");
		
		System.out.println(" ");
		
		
		//展示商品信息
		System.out.println("*********欢迎来到茶亭超市*********");
		System.out.println("----------------------------------");
		System.out.println("商品名称      数量    单价    金额");
		
		double goodsAmount1 = goodsPrice1 * goodsQuantity1;
		double goodsAmount2 = goodsPrice2 * goodsQuantity2;
		double goodsAmount3 = goodsPrice3 * goodsQuantity3;
		
		System.out.println(goodsName1 + "            " + goodsQuantity1 + "      " + goodsPrice1 + "     " + goodsAmount1);
		System.out.println(goodsName2 + "            " + goodsQuantity2 + "      " + goodsPrice2 + "     " + goodsAmount2);
		System.out.println(goodsName3 + "            " + goodsQuantity3 + "      " + goodsPrice3 + "     " + goodsAmount3);
		
		
		//商品统计信息
		System.out.println("----------------------------------");
		
		int goodsTotalQuantity = goodsQuantity1 + goodsQuantity2 + goodsQuantity3;//将三个商品的数量相加
		System.out.println("商品总数量：" + goodsTotalQuantity);
		double goodsTotalAmount = goodsAmount1 + goodsAmount2 + goodsAmount3;//将三个商品的金额相加
		System.out.println("商品总金额：" + goodsTotalAmount);
		
		//购买数量超过10件 或者 总金额大于100，就在总价的基础上打五折
		double discountAmount = (goodsTotalQuantity > 10 || goodsTotalAmount > 100) ? goodsTotalAmount * 0.5 : 0;
		System.out.println("以优惠金额：" + discountAmount);
		double actualAmount = goodsTotalAmount - discountAmount;
		System.out.println("实付金额：" + actualAmount);
		System.out.println(" ");
		
	}	
}