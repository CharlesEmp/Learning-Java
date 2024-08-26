package stringbuilder01;

/*
    StringBuilder成员方法

    append方法
        向容器中追加任意数据类型
    1.public StringBuilder append(boolean b)
    2.public StringBuilder append(char c)
    3.public StringBuilder append(char[] str)

    public int length
        返回容器中已储存的字符个数

    public String substring(int start, int end)
        截取容器中的字符，从start到end，不包含end

    public StringBuilder delete(int start, int end)
        删除容器中的字符，从start到end，不包含end

    public StringBuilder reverse()
         反转容器中的内容
 */

public class StringBuilderDemo02 
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        //method03();

        //method04();

        //method05();

        StringBuilder sb = new StringBuilder("你真的非常棒");
        sb.reverse();
        System.out.println(sb);//棒常非的真你
    }

    private static void method05() {
        StringBuilder sb = new StringBuilder("你好java");
        sb.delete(1 , 3);
        System.out.println(sb);//你ava
    }

    private static void method04() {
        StringBuilder sb = new StringBuilder("afkln");
        String substr = sb.substring(1 , 3);
        System.out.println(substr);//fk
    }

    private static void method03() {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());//0
        sb.append("def");
        sb.append("123");
        System.out.println(sb.length());//6

        //字符串获取长度
        //数组获取长度
    }

    private static void method02() {
        StringBuilder sb = new StringBuilder("cd");
        char[] chars = {'3' , 'a'};
        sb.append(chars);
        sb.append(false);
        System.out.println(sb);//"cd3afalse"
    }

    private static void method01() {
        StringBuilder sb = new StringBuilder();
        sb.append(5);//往StringBuilder容器中末尾追加了一个5
        sb.append("abc");//往StringBuilder容器中末尾追加了一个abc
        System.out.println(sb);//最终将容器中所有内容转化成一个字符串 “5abc”
    }
}
