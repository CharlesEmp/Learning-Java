package extends03;

class Fu
{
    int num = 17;
}

class Zi extends Fu
{
    int num = 19;

    public void show()
    {
        System.out.println(num);//即使重名，依然遵循就近原则
        System.out.println(super.num);//通过super关键字调用父类成员
    }
}
public class Demo02
{
    public static void main(String[] args)
    {
        Zi zi = new Zi();
        zi.show();
    }
}
