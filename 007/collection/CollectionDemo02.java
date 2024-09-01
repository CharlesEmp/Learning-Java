package collection;

/*
    集合的判断功能
        boolean contains(Object o);//判断集合中是否包含指定元素，如果包含，就返回true
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
