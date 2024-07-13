package abstractclass;

public class Demo02
{
    public static void main(String[] args)
    {
        Animal a = method02();//父类引用子类对象
        a.eat();
    }

    //将冲向类的引用类型定义为方法的返回值类型
    public static Animal method02()
    {
        /*Frog frog = new Frog();
        return frog;*/

        return new Frog();
    }
}
