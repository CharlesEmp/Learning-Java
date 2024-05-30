package permission02;

import permission01.Demo01;

/*
    不同包中的无关类
*/

public class Demo03
{
    public static void main(String[] args)
    {
        Demo01 d = new Demo01();
        d.method01();//public修饰的可以在任意位置访问
        //d.method02();
        //d.method03();
        //d.method04();
    }
}
