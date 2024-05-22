package constructor06;

public class Demo
{
    public static void main(String[] args)
    {
        //method01();//普通方法之间的相互调用
        new Person("蜡笔小新" , 6 ,"man");
    }

    public static void method01()
    {
        System.out.println("method01");
        method02(13);
    }
    public static void method02(int i)
    {
        System.out.println(i + " " + "method02");
    }
}