package arraylist01;

/*
    ArrayList存储自定义引用类型
        集合中存储对象，本质是存储地址值，将来可以根据地址值找到该对象
 */

import java.util.ArrayList;

public class ArrayListDemo06
{
    public static void main(String[] args)
    {
        ArrayList<Person> people = new ArrayList<>();
        Person p1 = new Person("ABC" , 18);
        Person p2 = new Person("DEF" , 17);
        Person p3 = new Person("GHI" , 19);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people);

        for(Person p : people)
        {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
