package charset;

public class CharSetDemo 
{
    public static void main(String[] args)
    {
        System.out.println((int)'a');//a对应的十进制字节 —— 97
        System.out.println((int)'A');//A对应的十进制字节 —— 65
        System.out.println((int)'你');//“你”中文字符默认使用UTF-16 —— 十进制20320十六进制4f60
    }
}
