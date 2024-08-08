package string02;

/*
    1. public String (String original)
        初始化一个新创建的String对象，使其表示一个与参数相同的字符串序列
    2. public String toString ()
        String重写了 toString，转换的结果就是字符串的值
    3. public boolean equal(Object anObject)
 */

public class Demo 
{
    public static void main(String[] args)
    {
        String str = new String("def");//调用指定的构造方法
        System.out.println(str.toString());//并没有输出地址值
                                           //说明String已经重写了toString
        String str02 = new String("ghk");
        String str03 = "ghk";
        System.out.println(str02.equals(str03));//true
                                                //比较两个字符串的内容，如果内容完全一致就返回true
        System.out.println("qq".equals("m"));//"qq"本身就是String类的对象，可以调用String类的方法
    }
}
