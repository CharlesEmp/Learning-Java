package constructor02;

/*
    构造方法 / 构造函数 / 构造器constructor
        普通方法的格式
            修饰符 返回值类型 方法名（形参列表）
            {
                //语句;
            }
        构造方法格式：构造方法的方法名必须是类名（所在的类名）
            修饰符 类名（方法名） （形参列表）
            {
                //语句
            }

 */

public class Person02
{
    private String name;
    private int age;
    private String gender;

    /*
        1.构造方法没有返回值类型
        2.构造方法方法名必须是类名
        3.构造方法没有返回值
     */
    public Person02(String name , int age , String gender)
    {
        //构造函数主要用来初始化成员
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
