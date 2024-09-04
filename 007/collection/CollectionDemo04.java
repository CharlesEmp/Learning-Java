package collection;

/*
    集合通用的迭代方式
        public interface Iterable
        {
            Iteratoe iterator();
        }

        public interface Collection extends Iterable
        {

        }

        public interface Iterator
        {
            boolean hasNext();
            Object next();
            void remove();
        }
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo04
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        Collection c = new ArrayList();
        c.add("SAB");
        c.add("DBA");
        c.add("OX");

        //for循环
        for (Iterator iterator = c.iterator();iterator.hasNext();)
        {
            System.out.println(iterator.next());
        }
    }

    private static void method02() {
        Collection c = new ArrayList();
        c.add("SAB");
        c.add("DBA");
        c.add("OX");

        //while循环
        Iterator iterator = c.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    private static void method01() {
        Collection c = new ArrayList();
        c.add("SAB");
        c.add("DBA");
        c.add("OX");
        System.out.println(c);//这个不是遍历，将元素逐个取出才叫遍历

        //1.先获取通用的迭代器对象
        Iterator iterator = c.iterator();

        //2.利用迭代器中的方法
        System.out.println(iterator.hasNext());//判断容器中是否存在下一个元素 存在"SAB" 返回true
        System.out.println(iterator.next());//取出"SAB"

        System.out.println(iterator.hasNext());//判断容器中是否存在下一个元素 存在"DBA" 返回true
        System.out.println(iterator.next());//取出"DBA"

        System.out.println(iterator.hasNext());//判断容器中是否存在下一个元素 存在"OX"  返回true
        System.out.println(iterator.next());//取出"OX"

        System.out.println(iterator.hasNext());//判断容器中是否存在下一个元素 此时容器中没有下一个元素，返回false
        //System.out.println(iterator.next());//NoSuchElementException 无此类元素
    }
}
