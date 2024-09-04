package generic04;

/*
    for(要遍历的容器中的元素类型 变量名 : 遍历的目标 数组或者集合)
    {
        //取出元素
    }
 */

import java.util.ArrayList;
import java.util.Collection;

public class Demo01
{
    public static void main(String[] args)
    {
        //method01();

        Collection<String> c = new ArrayList<>();//创建对象的时候指定实际类型为String，那么类中的泛型会被替换成String
        c.add("abc");
        c.add("def");
        c.add("ms");
        for (String s : c)
        {
            System.out.println(s);
            System.out.println(s.length());
        }
    }

    private static void method01() {
        Collection c = new ArrayList();//创建对象的时候没指定实际类型，那么类中的泛型会被替换成Object
                                        // public boolean add(Object e)
        c.add(123);
        c.add("abc");
        c.add("def");

        for (Object o : c)
        {
            System.out.println(o);
        }
    }
}
