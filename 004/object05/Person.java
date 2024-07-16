package object05;

/*
    所有的类都直接或者间接继承Object类

    由于利用equals方法比较内存地址值，没有实际意义
    我们一般在实际开发中比较对象的属性值更有意义

    重写equals标注：
        1.如果两个对象的属性完全相同，一般返回true
        2.如果两个对象中至少有一个属性不同，一般返回false
*/

public class Person /* extends Object*/
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if (!(obj instanceof Person))//如果obj指向的对象不是Person的对象，直接返回false
        {
            return false;//其中比较的一个对象已经不是Person对象，失去比较意义，直接返回false
        }

        Person p = (Person) obj;

        return this.name.equals(p.name) && this.age == p.age;
    }
}
