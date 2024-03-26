package extends03;
/*
    成员变量的访问特点
        遵循就近原则：在访问成员变量时，如果本类有该成员变量 —— 直接使用
                                     如果没有，则会继续查找父类
                                     子类 —— 父类 —— 父类的父类 —— ...... —— Object
                                     逐级查找，只要在其中一级查找，就拿过来使用，如果所有层级都没有就报错
*/
class Father /*extends Object*/
{
    int num = 13;
}

class Son extends Father
{
    int num2 = 16;

    public void show()
    {
        System.out.println(num + ".." + num2);
    }
}

public class Demo01
{
    public static void main(String[] args)
    {
        Son son = new Son();
        son.show();
    }
}
