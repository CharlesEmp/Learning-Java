/*
	1.3利用for循环打印ABCDEFG..XYZ,26个大写字母与26个小写字母

*/

public class LoopDemo02
{
	public static void main (String[] args)
	{
		/*①
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
		
		/*②
		for(int a = 65 ; a < 91 ; a++)
		{
			System.out.println((char)a + "" + (char)(a + 32));
		}
		*/
		
		//③
		char upperLetter = 'A';
		char lowerLetter = 'a';
		
		for(int i = 0 ; i < 26 ; i++)
		{
			System.out.println(upperLetter + "" + lowerLetter);//第一次循环 A a
															   //upperLetter = (char)('A' + 1) = 'B'
															   //lowerLetter = (char)('a' + 1) = 'b'
			//upperLetter = (char)(upperLetter + 1);//1默认是int类型
										          //先把char转换成int ‘A’ => 65
										          //然后再做运算  65 + 1 = 66
			upperLetter += 1;
			//lowerLetter = (char)(lowerLetter + 1);
			lowerLetter++;
		}
		
	}
}