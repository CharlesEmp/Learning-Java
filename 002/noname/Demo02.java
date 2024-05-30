package noname;

public class Demo02 
{
    public static void main(String[] args)
    {
        Animal a1 = new Animal("white");
        feed(a1);

        //为了传值方便，不再先将对象赋值给一个引用变量，而是直接传这个变量
        //适合只传一次参数
        feed(new Animal("cat"));
    }

    public static void feed(Animal a)
    {
        System.out.println(a.name);
    }
}
