/*
	forѭ���ṹ
	��ʽ��
		for(������������ʼ���� ; �������ʽ ; �������ʽ)
		{
			
		}
*/

public class ForDemo
{
	public static void main (String[] args)
	{ 
		/*
			for��ִ���߼���
				1. int i = 0
				2. �ж�i<3 �������Ϊtrue�������forѭ��
				3. ��ӡi��ֵ 0
				4. ִ�в��� i++ �� i = 1
				5. �ж�i<3 �������Ϊtrue�������forѭ��
				6. ��ӡi��ֵ 1
				7. ִ�в��� i++ �� i = 2
				8. �ж�i<3 �������Ϊtrue�������forѭ��
				9. ��ӡi��ֵ 2
				10.ִ�в��� i++ �� i = 3
				11.�ж�i<3 �������Ϊfalse��������forѭ��
		*/
		for (int i = 0 ; i < 3 ; i++)
		{
			System.out.println(i);
		}
		
		//System.out.println(i);//��Ϊ int i ����forѭ���������ģ�i�����������for��ѭ���У�����ʹ��i��ֵ
		
		int a = 0;//����a�������򣬴�����λ�õ�main����
		for ( ; a < 3 ; a++)
		{
			System.out.println(a);
		}
		System.out.println(a);
	}
}