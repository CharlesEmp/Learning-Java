package innerclass01;

/*
    成员内部类
        定义在成员位置（类中 方法外）上的类，称之为成员内部类
    成员内部类可以使用修饰符
    以下类编译后会生成：
        Person.class
        Persong$Heart.class
    成员内部类编译后的形式：外部类名$内部类名.class
*/

public class Person 
{
    //private String name;

    class Heart
    {
        //Heart类的成员方法
        public void jump()
        {
            System.out.println("心脏正在跳动");
        }
    }

    /*
    public void method()
    {

    }
    */

    public static void main(String[] args)
    {

    }
}
