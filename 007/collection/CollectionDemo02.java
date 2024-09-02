package collection;

/*
    集合的判断功能
        boolean contains(Object o);//判断集合中是否包含指定元素，如果包含，就返回true
                                   //原理：底层会拿要判定的元素与集合中的元素利用equals方法一一对比
                                   //如果在对比过程中，equals方法返回true 代表集合包含要判定的元素 contains方法返回true
        boolean isEmpty();         //判断集合中是否有元素，如果有元素，就返回false
                                   //原理：利用size()判断集合是否为空，如果size() ==0则说明集合为空，则没有元素
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        //method03();

        //method04();

        Person p1 = new Person("AB", 19);
        Person p2 = new Person("CB", 18);
        Collection c = new ArrayList();
        c.add(p1);
        c.add(p2);
        Person p3 = new Person("AB", 19);
        System.out.println(c.contains(p3));//true
        System.out.println(c.contains(p1));//true

    }

    private static void method04() {
        //未重写equals方法
        Person p1 = new Person("AB", 19);
        Person p2 = new Person("CB", 18);
        Collection c = new ArrayList();
        c.add(p1);
        c.add(p2);
        Person p3 = new Person("AB", 19);
        System.out.println(c.contains(p3));//false
        System.out.println(c.contains(p1));//true
    }

    private static void method03() {
        Person p1 = new Person("AB", 19);
        Person p2 = new Person("CB", 18);
        Collection c = new ArrayList();
        c.add(p1);
        c.add(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(c);//未重写时[collection.Person@2f4d3709, collection.Person@4e50df2e]
        //当打印集合的时候，集合默认会调用toString()，而里面的元素也会调用toString()
        //重写后[Person{name='AB', age=19}, Person{name='CB', age=18}]
    }

    private static void method02() {
        Collection c = new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        System.out.println(c.isEmpty());//false
        c.clear();
        System.out.println(c.isEmpty());//true
    }

    private static void method01() {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        System.out.println(c.contains("def"));//true
        System.out.println(c.contains("ghk"));//false
        System.out.println(c.contains("de")); //false
    }
}
