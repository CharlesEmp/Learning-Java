/*
	�߼������
		�����߼����������ı��ʽ���ǲ������ʽ��true/false��
		����������Ҳһ���ǲ�������
	&&���루���ң�
		����ͬʱ���㣬��������ս����Ϊ ��
		ȫ�� ��Ϊ �� ���м� ��Ϊ ��
	||���򣨻��ߣ�
		����������һ����������ս����Ϊ ��
		���� ��Ϊ �� ��ȫ�� ��Ϊ ��
	! ���ǣ�ȡ����
		 !true == false !false == true

*/

public class OperatorDemo05
{
	public static void main (String[] args)
	{
		//&&�����
		System.out.println(5>3 && 4>3);//true && true == true
		System.out.println(5>6 && 4>3);//false && true == false 
		System.out.println(4>3 && 5>6);//true && false == false
		System.out.println(5>6 && 3>4);//false && false == false
		System.out.println("");
		
		//||�����
		System.out.println(5>3 || 4>3);//true || true == true
		System.out.println(5>6 || 4>3);//false || true == true 
		System.out.println(4>3 || 5>6);//true || false == true
		System.out.println(5>6 || 3>4);//false || false == false
		System.out.println("");
		
		//!�����
		int a = 10;
		int b = 4;
		System.out.println(!(a>b));//false
		System.out.println(!(a<b));//true
		
	}
}