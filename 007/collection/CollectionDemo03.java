package collection;

/*
    集合中的移除功能
        boolean remove(Object o);
        如果移除成功，返回true 否则返回false
        原理：
            1.先查找：将要删除的元素与集合中的元素利用equals方法一一对比，一旦equals方法返回true代表找到元素
            2.如果没找到，remove返回false
            3.如果找到，则remove删除已有元素
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03
{
    public static void main(String[] args)
    {
        //method01();

        Collection c = new ArrayList();
        Person p1 = new Person("ASD", 30);
        Person p2 = new Person("SEG", 20);
        c.add(p1);
        c.add(p2);
        Person p3 = new Person("ACD" , 30);
        System.out.println(c.remove(p3));//false
        System.out.println(c);


    }

    private static void method01() {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        System.out.println(c);//[abc, def]
        System.out.println(c.remove("def"));//true如果移除成功就返回true，否则则返回false
        System.out.println(c.remove("cdk"));//false
        System.out.println(c);//[abc]
    }
}
