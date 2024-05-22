package constructor04;

public class Person
{
    private String name;
    private int age;
    private String gender;

    //1.在类中不手动定义构造方法，编译器会默认添加一个空参构造方法
    /*public Person()
    {

    }*/

    //2.一旦手动定义构造方法，则不再有默认构造方法
    /*public Person(String name , int age , String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }*/

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

