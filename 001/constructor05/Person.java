package constructor05;

/*
    构造方法重载
        重载条件：方法名相同，形参列表不同（个数，顺序，类型至少有一个不同）
    构造方法和普通方法的区别：
        1.构造方法不定义返回值类型
          普通方法必须定义返回值类型
        2.构造方法通过new调用
          普通方法通过对象调用
 */

public class Person
{
    private String name;
    private int age;
    private String gender;

    //1.在类中不手动定义构造方法，编译器会默认添加一个空参构造方法
    public Person()
    {
        System.out.println("空参构造方法被调用");
    }

    //2.一旦手动定义构造方法，则不再有默认构造方法
    public Person(String name , int age , String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("手动三个参数构造方法被调用");
    }

    public Person(String name , int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("手动两个参数构造方法被调用");
    }

    //私有化构造方法，仅能在本类使用构造方法
   /* private Person(String name )
    {
        this.name = name;
        System.out.println("手动一个参数构造方法被调用");
    }*/

    //因为有返回值类型，所以该方法不再是构造方法，而是普通方法
    public void Person(String name , int age)
    {
        System.out.println("该方法被调用");
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



