package string01;

/*
    String类表示字符串    Java程序中的所有字符串（例如“abc”）都是作为此类的实例实现的
    字符串是恒定的，他们的值创建后就无法更改
 */

public class Demo 
{
    public static void main(String[] args)
    {
        String str = "abc";//字符串变量本质就是定义一个引用数据类型
                           //abc 代表iao一个String类的（字符串）对象

        String str02 = new String("abc");
        System.out.println(str);
        System.out.println(str.toString());

        str = "def";//相当于改变的是str引用指向的对象
        System.out.println(str);

    }
}
