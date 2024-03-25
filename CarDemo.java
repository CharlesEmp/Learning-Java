package Demo01;
/*
    常见对象的格式
        类名 引用变量名 = new 类名();

    成员变量的使用
        赋值格式 引用变量名.成员变量名 = 值

    成员方法使用格式
        引用变量名.方法名(值1，值2，......)
*/
public class CarDemo
{
    public static void main(String[] args)
    {
        //1.制造一辆车,相当于我们代码中的一个车对象
        Car c = new Car();

        //2.给车的颜色和轮子个数赋值
        c.color = "星空灰";
        c.number = 4;

        System.out.println(c.color + " " + c.number);

        //3，调用车类中的行驶方法,调用c引用变量所属的类的方法
        c.run();
    }
}
