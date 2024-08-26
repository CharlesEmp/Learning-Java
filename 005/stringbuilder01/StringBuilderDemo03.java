package stringbuilder01;

/*
    stringbuilder原理
 */

public class StringBuilderDemo03 
{
    public static void main(String[] args)
    {
        //method01();

        //1.初始化容量（当前数据字符长度+默认容量 3+16 = 19）
        //2.判断存入的字符是否是latin-1的字符，如果是，就用单字节
        //3.byte[] value = new byte[3+16]
        //4.将abc追加到value数组中
        StringBuilder sb = new StringBuilder("abc");

        //1.初始化容量（当前数据字符长度+默认容量 2+16 = 18）
        //2.判断存入的字符是否是latin-1的字符，如果不是，就用双字节
        //3.byte[] value = new byte[（2+16）*2]
        //4.将“你好”追加到value数组中 （每相邻的两个元素（两个字节）就代表一个字符）
        StringBuilder sb02 = new StringBuilder("你好");


    }

    private static void method01() {
        //new stringbuilder
        //底层创建一个默认长度为16的字节数组
        //byte[] value = new byte[16]
        //该字节数组用来存储数据（相当于底层使用的容器）
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        sb.append(9);
        sb.append(5.7);
        System.out.println(sb);
    }
}
