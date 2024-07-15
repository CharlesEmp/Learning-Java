package object02;

/*
    所有的类都直接或者间接继承Object类
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

    //由于Object类中原始的toString方法默认返回内存地址的哈希值，没有具体业务含义
    //    因此我们在使用的时候，默认都是重写Object类中的toString方法
    //    重写标准：
    //       将所有对象的属性拼接成一个字符串返回
    /*@Override
    public String toString()
    {
        return "Name=" + name + ",Age=" + age;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
