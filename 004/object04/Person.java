package object04;

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
        //this = p1 = new Person("A", 19);
        //obj  = p2 = new Person("B", 20);
        //this.name.equals(p.name) 调用的是字符串类（String）类中的equals方法，比较的是字符串内容
        Person p = (Person) obj;
        /*if (this.name.equals(p.name) && this.age == p.age)
        {
            return true;
        }
        else
        {
            return false;
        }*/
        return this.name.equals(p.name) && this.age == p.age;
    }
}
