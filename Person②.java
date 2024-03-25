package Demo05;
/*
    人类：
        属性：
            姓名|年龄
        行为：
            吃饭
    使用关键字private:私有
        当我们私有化变量之后，该变量不能在类外直接访问
        如果修饰成员方法，则该方法只能在类内使用
*/

public class Person
{
    //属性 —— 成员变量
    String name;
    private int age;

    //专门提供一个public修饰的setxxx，xxx代表属性名
    //为属性赋值
    public void setAge(int a)
    {
        //可以在方法中对变量的值进行控制
        if(a < 0)
        {
            System.out.println("年龄不能为负值");
            return;
        }
        age = a;
    }

    //提供一个public修饰的getxxx
    //为获取属性值
    public int getAge()
    {
        return age;
    }

    //行为
    public void eat()
    {
        System.out.println(name + "正在吃饭");
    }
}
