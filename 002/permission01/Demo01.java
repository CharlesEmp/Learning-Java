package permission01;

/*
    同一类中
*/

public class Demo01
{
    public void method01()
    {

    }

    //不写权限修饰符就代表默认权限
    void method02()
    {

    }

    protected void method03()
    {

    }

    private void method04()
    {

    }

    public static void main(String[] args)
    {
        Demo01 d = new Demo01();
        d.method01();//public修饰的可以在任意位置访问
        d.method02();
        d.method03();
        d.method04();
    }
}
