/*
	forѭ����ϰ��
		����forѭ������ 1+2+3+4+5
	������
		�������������㣺
			ÿ����ӵĽ������һ�������
*/

public class ForDemo02
{
	public static void main (String[] args)
	{
		int a = 1;
		int b = 0;
		
		for ( ; a < 6 ; a++)
		{
			b = b + a;
			System.out.println("a=" + a + ",b=" + b);
		}
		
		System.out.println(b);
		
	}
}