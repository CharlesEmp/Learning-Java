/*
	������ע������;
		1.�������������к������������У����ܷ����׷��� ���������������������⡿
		2.�����β��϶���ı�������������ڷ�����
		3.���ܶ���������ȫ��ͬ�ķ���
		4.����õķ������Է���ʹ�ã���ߴ���ĸ�����
		5.���÷������ε�ʱ��֧�����͵��Զ�����
		6.�������ֵ����Ϊvoid����returnֵ��Ҳ����ֱ�Ӵ�ӡ
		7.�������ֵ���Ͳ���void����ֱ�Ӵ�ӡ
		8.�����������ֵ���Ͳ���void����Է���ֵ���ǿ��Ի�ȡҲ���Բ���ȡ
*/

public class MethodDemo02
{
	public static void main (String[] args)
	{
		//��
		/*public static int method01()
		  {
		  	  return 3;
		  }
		*/
		
		//��
		method02(13);
		//System.out.println(i);//�������Ҳ�������
								//��main�в���ʹ��method02�е�i����
		
		//��
		/*
		int width = 3;
		int length = 4;
		System.out.println(width * length);
		
		int width2 = 12;
		int length2 = 17;
		System.out.println(width2 * length2);
		*/
		System.out.println(getArea(3 , 4));
		System.out.println(getArea(12 , 17));
	}
	
	//��
	public static int method01 ()
	{
		return 3;
	}
	
	//��
	public static void method02 (int i)	
	{
		System.out.println(i);
	}
	
	//��
	/*
	public static void method02 (int i)//������������ MethodDemo02�ж����˷���
	{
		
	}
	*/
	
	//��
	public static int getArea (int length , int width)
	{
		int area = length * width;
		return area;
	}
	
}