package extends01;
/*
    class A
    {
    }
    class B extends A
    {
        //其中A是父类，B是子类
    }

    当产生继承关系后，子类会自动继承父类的所有非私有成员
 */
public class Teacher extends Person
{
    double salary;

    public void teach()
    {
        System.out.println(name + "教学");
    }
}
