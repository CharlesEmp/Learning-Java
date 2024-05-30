package permission02;

import permission01.Demo01;

/*
    不同包中的子父类
*/

public class Demo04 extends Demo01
{
    public void show()
    {
        method01();//public修饰的可以在任意位置访问
        //method02();
        method03();//不同包下的子父类，子类可以访问父类中的protected修饰方法
        //method04();
    }
}
