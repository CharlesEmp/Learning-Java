package static04;

/*
    非静态成员变量 —— 随着对象的创建产生
                   创建几个对象就会有几份非静态成员变量

    同一个静态成员变量 —— 只有一份
                    如果修改，修改的是同一份
                    静态成员变量会对所有对象共享
 */

public class Demo 
{
    int i;
    static int j = 17;

    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.i = 9;
        d1.j = 21;

        System.out.println(d1.i);//9
        System.out.println(d1.j);//21
        System.out.println(d2.i);//0
        System.out.println(d2.j);//21
    }
}
