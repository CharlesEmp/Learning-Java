package normalclass;

/*
    方法中返回的引用变量，本质上返回的是变量中储存的对象地址值
    方法中返回匿名对象，本质上返回的依然是对象的地址值

*/

public class Demo02
{
    public static void main(String[] args)
    {
        Worker worker = method01();
        System.out.println(worker.name);//Jiang

        Person p = method02();
        System.out.println(p.name);//null

        Worker worker02 = method03(worker);
        System.out.println(worker02.name);//Zyo
    }

    //将自定义引用类型作为返回值类型
    public static Worker method01()
    {
      Worker w = new Worker();
      w.name = "Jiang";
      return w;
    }

    //将自定义引用类型的父类型作为返回值类型
    public static Person method02()
    {
        return new Worker();
    }

    //将自定义引用类型既作为形参也作为返回值类型
    public static Worker method03(Worker w)
    {
        w.name = "Zyo";
        return w;
    }
}
