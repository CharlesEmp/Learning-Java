package collection;

/*
    Collection接口中（单列集合体系）的通用方法
        1.添加和获取功能
            boolean add(Object e);//向集合容器中添加元素
            int size();           //获取存储的元素个数
            c.clear();            //清空集合中的元素
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.SequencedCollection;

public class CollectionDemo01
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        Collection c = new ArrayList();
        c.add("张三");
        c.add("老四");
        c.add("王五");
        System.out.println(c);
        c.clear();
        System.out.println(c);
    }

    private static void method02() {
        //2.获取存储的元素个数
        //一般来说，我们在一个容器中只存一种数据，为了防止后期处理数据混乱
        Collection c = new ArrayList();
        c.add(123);// Object e = Integer.valueOf(123) object引用指向Integer子类对象
        c.add("abc");
        c.add(456);
        c.add("def");
        System.out.println(c.size());
        System.out.println(c);
    }

    private static void method01() {
        //1.向集合容器中添加元素
        Collection c = new ArrayList();//父接口指向子对象（多态）
        c.add("abc");//Object e = "abc 父类引用指向子类对象
        c.add("def");
        System.out.println(c);//[abc, def] 打印集合容器中的所有元素
    }
}
