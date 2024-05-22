package constructor06;

/*
    构造方法之间的相互调用
        1.只能通过this（参数），调用其他构造方法
        2.this（参数）语句只能放在构造方法的第一行，从面向对象的思想来说，先把所有的初始化动作执行完，再执行其他操作
        3.不写this（参数）语句，默认不会添加
        4.构造方法中可以调用普通方法
        5.普通方法中不可以调用构造方法（this语句）
    this语句和this关键字的对比
        this关键字主要用来调用成员，区分成员变量和局部变量
        this语句主要用来实现构造方法之间的相互调用
 */

public class Person
{
    private String name;
    private int age;
    private String gender;

    public Person(String name , int age , String gender)
    {
        //Person(name , age);//调用构造方法不能使用普通方法的调用格式
        this(name , age);
        this.gender = gender;
    }

    public Person(String name , int age)
    {
        this.name = name;
        this.age = age;
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



