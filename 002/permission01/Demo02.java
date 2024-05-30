package permission01;

/*
    同一包不同类中
*/

public class Demo02 
{
    public static void main(String[] args)
    {
        Demo01 d = new Demo01();
        d.method01();
        d.method02();
        d.method03();
        //d.method04();
    }
}
