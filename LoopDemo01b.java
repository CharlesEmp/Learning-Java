/*
	1.1  ������е�ˮ�ɻ�����������
	  һ��3λ������ÿλ���������͵����䱾��
	  ��153 = 1*1*1 + 3*3*3 + 5*5*5 = 1 + 27 + 125
	(	1.��λ����Χ 100-999
		2.ˮ�ɻ��������� number = number��λ������ + numberʮλ������ + number��λ������
	)
*/

public class LoopDemo01b
{
	public static void main (String[] args)
	{
		/*
		//�ж�ĳ����λ���Ƿ���ˮ�ɻ���
		int number = 352;
		//��ȡÿλ����
		int ge = number % 10;
		int shi = number / 10 % 10;
		int bai = number / 100 % 10;
		System.out.println(ge + " " + shi + " " + bai);
		
		//�ж��Ƿ�Ϊˮ�ɻ���
		if( ge * ge * ge + shi * shi * shi + bai * bai * bai == number)
		{
			System.out.println(number + "��ˮ�ɻ���");
		}
		else
		{
			System.out.println(number + "����ˮ�ɻ���");
		}
		*/
		
		print();
		
	}
	
	public static void print()
	{
		for(int number = 100 ; number < 1000 ; number++)
		{
			//��ȡÿλ����
			int ge = number % 10;
			int shi = number / 10 % 10;
			int bai = number / 100 % 10;
			
			//�ж��Ƿ�Ϊˮ�ɻ���
			if( ge * ge * ge + shi * shi * shi + bai * bai * bai == number)
			{
				System.out.println(number + "��ˮ�ɻ���");
			}
		}
	}
}