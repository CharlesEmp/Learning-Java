package Demo06;

import java.sql.SQLOutput;

public class PersonDemo
{
    public static void main(String[] args)
    {
        method01();

    }

    public static void method01() {
        Person p = new Person();

        p.setName("Charles");
        p.setAge(18);

        System.out.println(p.getName() + p.getAge());
    }
}
