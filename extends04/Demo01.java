package extends04;
/*
    成员方法访问原则：
        就近原则：

*/
class Fu
{
    public void show()
    {
        System.out.println("Fu");
    }
}

class Zi extends Fu
{
    public void print()
    {
        System.out.println("Zi");
    }
}

public class Demo01
{
    public static void main(String[] args)
    {
        Zi zi = new Zi();
        zi.print();
        zi.show();
    }
}
