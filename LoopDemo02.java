/*
	1.3����forѭ����ӡABCDEFG..XYZ,26����д��ĸ��26��Сд��ĸ

*/

public class LoopDemo02
{
	public static void main (String[] args)
	{
		/*��
		for(int a = 65 ; a < 91 ; a++)
		{
			System.out.print((char)a);
		}
		System.out.println();
		for(int a = 97 ; a < 123 ; a++)
		{
			System.out.print((char)a);
		}
		*/
		
		/*��
		for(int a = 65 ; a < 91 ; a++)
		{
			System.out.println((char)a + "" + (char)(a + 32));
		}
		*/
		
		//��
		char upperLetter = 'A';
		char lowerLetter = 'a';
		
		for(int i = 0 ; i < 26 ; i++)
		{
			System.out.println(upperLetter + "" + lowerLetter);//��һ��ѭ�� A a
															   //upperLetter = (char)('A' + 1) = 'B'
															   //lowerLetter = (char)('a' + 1) = 'b'
			//upperLetter = (char)(upperLetter + 1);//1Ĭ����int����
										          //�Ȱ�charת����int ��A�� => 65
										          //Ȼ����������  65 + 1 = 66
			upperLetter += 1;
			//lowerLetter = (char)(lowerLetter + 1);
			lowerLetter++;
		}
		
	}
}