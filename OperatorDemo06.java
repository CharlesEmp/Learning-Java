/*
	&&��||��ע������
		&&������ ��·��
			�����в������ʽһ����false�����ټ������㣬ֱ�ӵó���� false
		||������ ��·��
			�����в������ʽһ����true�����ټ������㣬ֱ�ӵó���� true
*/

public class OperatorDemo06
{
	public static void main (String[] args)
	{
		//&&ע������
		int a = 3;
		boolean b = true && ++a>2;//������Ϊtrue�����������++a
		System.out.println("a="+a);//4
		System.out.println("b="+b);//true
		
		int c = 4;
		boolean d = false && ++c>5;//������Ϊfalse����������++c
		System.out.println("c="+c);//4
		System.out.println("d="+d);//false
		
		//||ע������
		int m = 3;
		boolean n = true && ++m>2;//������Ϊtrue�����ټ���++m
		System.out.println("m="+m);//3
		System.out.println("n="+n);//true
		
		int j = 4;
		boolean k = false && ++j>5;//������Ϊfalse�����������++j
		System.out.println("j="+j);//4
		System.out.println("k="+k);//true
		
	}
}