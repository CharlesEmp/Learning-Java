package Demo06;
/*
    利用getxxx以及setxxx来为person类中的属性 赋值 和 取值

    当成员变量名和局部变量名重名时，可以用this关键字区分
    通过this.成员变量

    方法中的this，会指向调用对象
 */
public class Person
{
    private String name;
    private int age;

    //为了让形参名字更具有 可识别性 n变量名为方法形参，用name
    /*public void setName(String name)
    {
        name = name; //变量的使用遵循就近原则
                     //两个name都是方法上的name
                     //成员变量中的name仍然是默认值null
    }*/
    public void setName(String name)
    {
        //name = name; //变量的使用遵循就近原则
        this.name = name;//此处的this.name使用成员变量
                         //this.name = p.name
    }

    public void setAge(int age)
    {
        this.age = age;

    }

    public String getName()
    {
        return name;
        //相当于 return this.name;
    }

    public int getAge()
    {
        return age;

    }
}
