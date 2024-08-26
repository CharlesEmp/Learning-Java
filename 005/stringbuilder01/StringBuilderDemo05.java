package stringbuilder01;

/*
    StringBuilder链式编程
 */

public class StringBuilderDemo05 
{
    public static void main(String[] args)
    {
        //method01();

        /*
        StringBuilder sb = new StringBuilder();
        StringBuilder sb02 = sb.append(7).append("def");
        System.out.println(sb);
        System.out.println(sb02);
        */
        String str = new StringBuilder().append(7).append("def").append(3.14).toString();//链式编程
        System.out.println(str);
    }

    private static void method01() {
        //sb sb02 sb03都指向同一个StringBuilder对象，最开始的容器
        //sb = sb02 = sb03
        StringBuilder sb = new StringBuilder();
        StringBuilder sb02 = sb.append(9);
        StringBuilder sb03 = sb02.append("abc");
        System.out.println(sb == sb02);//true
        System.out.println(sb02 == sb03);//true
        System.out.println(sb == sb03);//true
        System.out.println(sb);
    }
}
