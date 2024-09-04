package collection;

/*
    需求：
        定义一个集合，向集合中添加三个字符串“abc”“def”“ghk”
        删除ghk元素，最终容器中只有“abc”“def”

    问题：ConcurrentModificationException并发修改异常
        由于我们在使用迭代器的方法遍历过程中，使用了集合的方法进行 删除/添加 导致了集合结构的改变
        从而导致并发修改异常
        涉及到 多线程访问共享数据的安全问题（多线程）
        Java中为了避免这种问题产生，因此抛出一个并发修改异常，来提前终止程序

    解决方案：
        如果使用迭代器的方式进行遍历，在遍历过程中需要针对集合添加/删除元素，要使用迭代器的方法来完成
        从而避免并发修改异常

        如果使用集合的方式进行遍历，在遍历过程中需要针对集合添加/删除元素，要使用集合的方法来完成
        从而避免并发修改异常
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo05
{
    public static void main(String[] args)
    {
        //method01();

        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add("ghk");

        //1.获取一个迭代器
        Iterator iterator = c.iterator();

        //2.逐个迭代集合中的元素
        while(iterator.hasNext())
        {
            Object element = iterator.next();
            //当遍历到ghk的时候，把它删除
            if (element.equals("ghk"))
            {
                iterator.remove();//移除当前迭代器的元素
            }
        }

        System.out.println(c);
    }

    /*
        并发修改异常的产生
     */
    private static void method01() {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add("ghk");

        //1.获取一个迭代器
        Iterator iterator = c.iterator();

        //2.逐个迭代集合中的元素
        while(iterator.hasNext())
        {
            Object element = iterator.next();
            //当遍历到ghk的时候，把它删除
            if (element.equals("ghk"))
            {
                c.remove(element);
            }
        }
    }
}
