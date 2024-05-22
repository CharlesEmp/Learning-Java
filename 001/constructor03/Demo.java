package constructor03;

/*
    构造方法和setter方法的区别以及联系
        1.构造方法主要用来初始化类中的成员变量
        2.setter方法 我们一般在创建完对象后，用其修改某个属性值
        3.构造方法只要new对象就会被调用，相当于每个对象只调用一次
          而setter方法可以被同一个对象反复调用
 */

public class Demo
{
    public static void main(String[] args)
    {
        Person p1 = new Person("张三" , 20 , "女");
        System.out.println(p1.getName());

        //代表又来一个人叫张思，而不是将原来的张三名字修改为张思
        //这是因为每new一次都代表一个新事物
        Person p2 = new Person("张思" , 20 , "女");
        System.out.println(p2.getName());

        //set 可以修改原对象中的属性值
        p1.setName("张三三");
        System.out.println(p1.getName());
    }
}
