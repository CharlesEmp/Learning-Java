package stringbuilder01;

/*
    StringBuilder构造方法
    1.public StringBuilder();
        构造一个初始容量为16的容器（底层用的是字节数组）
    2.public StringBuilder(String str);
        造一个初始化为指定字符串内容的字符串容器
 */

public class StringBuilderDemo01 
{
    public static void main(String[] args)
    {
        //method01();

        StringBuilder sb = new StringBuilder("def");//构造一个StringBuilder容器，初始化内容为def
        System.out.println(sb);//def
        System.out.println(sb.toString());//def
    }

    private static void method01() {
        StringBuilder sb = new StringBuilder();//构造一个空的StringBuilder容器
        System.out.println(sb);//直接打印容器，相当于将容器中的内容转换成一个字符串，而此时容器为空
        //底层最终会创建一个空串
        System.out.println(sb.toString());
    }
}
