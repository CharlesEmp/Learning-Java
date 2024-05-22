package constructor10;

/*
    描述老师和工人这两个类，将他们的共性 name 和 age 抽取出来存放在父类中，并提供相应的get和set方法
    同时需要在创建老师和工人对象就必须明确姓名和年龄
 */

public class Demo 
{
    public static void main(String[] args)
    {
        Teacher t = new Teacher("王老师" , 30);
        System.out.println(t.getName() + t.getAge());

        Worker w = new Worker("王工人" , 30);
        System.out.println(w.getName() + w.getAge());
    }
}
