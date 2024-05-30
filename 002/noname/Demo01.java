package noname;

/*
    匿名对象:
        无名 （不讲这个都西昂赋值给引用变量）对象
        格式：
            new 类名（参数）;//依然回去调用相应的构造方法
*/

public class Demo01 
{
    public static void main(String[] args)
    {
        //创建对象 —— 使用空参构造
        Animal a1 = new Animal();
        a1.name = "red";
        System.out.println(a1.name);

        //创建对象 —— 使用有参构造
        Animal a2 = new Animal("black");
        System.out.println(a2.name);

        //匿名对象 —— 使用空参构造
        new Animal().name = "blue";
        System.out.println(new Animal().name);

        //匿名对象 —— 使用有参构造
        new Animal("white");
        System.out.println(new Animal("white").name);
    }
}
