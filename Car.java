package Demo01;
/*
    需求：描述汽车
    面向对象分析问题的一般步骤：
        1.分析需求中有几个事物：一个事物 —— 汽车
        2.将事物描述成对应的类：汽车 —— class Car {}
        3.分析这个事物所具有的属性和行为：
            属性（固有特征）：颜色，轮数量
            行为：行驶
        4.将属性和行为在该类中进行描述
            属性 —— 类中的成员变量：类中 方法外
            行为 —— 类中的成员方法
*/
public class Car
{
    //成员变量
    String color;
    int number;

    //成员方法：与之前的方法定义相同，但是成员方法不加static修饰
    public void run ( )
    {
        System.out.println(color + "的" + number + "个轮子的车在行驶");
    }

    /*
    //我们这个Car类是描述车的属性和行为，main方法不代表车的任何行为
    //所以定位到Car类不合适
    public static void main(String[] args)
    {

    }
    */
}
