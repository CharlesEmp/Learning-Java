/*
	Whileѭ���ṹ
	��ʽ��
		while (����)
		{
			ѭ�����
		}
	������Ϊtrue����һֱִ��ѭ��  ֱ������Ϊfalse��������ѭ��
*/

public class WhileDemo
{
	public static void main (String[] args)
	{
		/*
			whileִ���߼�������
				1. int = 0;
				2. ���ж�ѭ��������x<=2��  ��true�����ִ��while����
				3. ��ӡ x ��ֵ 0
				4. ִ�� x++ , ��� x=1
				5. �ж�ѭ��������x<=2��  ��true�����ִ��while����
				6. ��ӡ x ��ֵ 1
				7. ִ�� x++ , ��� x=2
				8. �ж�ѭ��������x<=2��  ��true�����ִ��while����
				9. ��ӡ x ��ֵ 2
				10.ִ�� x++ , ��� x=3
				11.�ж�ѭ��������x<=2��  ��false�� ��ִ��while����
				12.ִ��whileѭ�������䣬�� ���x��ֵ 3
		*/
		int x = 0;
		
		while (x <= 2)
		{
			System.out.println(x);
			x++;
		}
		System.out.println(x);
		
	}
}