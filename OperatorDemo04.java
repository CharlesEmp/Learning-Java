/*
	�Ƚ��������(���յ�����������true��false)
		==���Ⱥ������
		!=�����Ⱥ������
		>=�����ڵ��������
		<=��С�ڵ��������
*/

public class OperatorDemo04
{
	public static void main (String[] args)
	{
		//=��==����
		//=����������ֵ
		//==���ж����ұ��ʽ��ֵ�Ƿ���ͬ����ͬΪtrue����ͬΪfalse
		int a = 3;
		int b = 7;
		System.out.println(a = b);//7
								  //a = 7, b = 7
		System.out.println(a == b);//true
		//!=�����
		int c = 10;
		double d = 10.0;
		System.out.println(c != d);//false
		
		//>�����
		System.out.println(10>6);//true
		
		//>=����������� ���� �� ���� ����֮һ�������Ϊ�棩
		System.out.println(6>=6);//true
		System.out.println(7>=2);//true
		System.out.println(5>=10);//false
		
		
	}
}