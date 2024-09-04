package collection;

/*
    Jdk 5新特性：
        增强for循环（for-each）：
            适用场景：
                简化集合和数组的遍历
                要求集合必须继承或实现Iterable接口
            格式：
                for(要遍历的容器中的元素类型 变量名 : 遍历的目标 数组或者集合)
                {
                    //取出元素
                }
            注意事项：
                1.增强for在遍历的时候无法操作数组的索引
                2.增强for针对集合来说，底层依旧使用迭代器
                3.注意增强for上元素的类型
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo06
{
    public static void main(String[] args)
    {
        //method01();

        Collection c = new ArrayList();
        c.add("abc");
        c.add(123);
        c.add("ef");

        //增强for针对集合来说，底层依旧使用迭代器
        for (Object element : c)
        {
            System.out.println(element);
        }

        System.out.println("-----------------");

        /*
        for (Object element : c)
        {
            String str = (String) element;//报错：ClassCastException类型转换异常
                                          //当我们遍历第二个元素，相当于Object element = new Integer(123);
                                          //String str = (String)new Integer(123);导致类型转换异常
            System.out.println(str.charAt(1));
        }
        */

        for (Object element : c)
        {
            //判断当前element中指向的对象是否是String的实例
            if (element instanceof String str)
            {
                System.out.println(str.charAt(1));
            }
            else
            {
                System.out.println(element);
            }
        }
    }

    private static void method01() {
        int[] arr = {13 , 17 , 16 , 21};

        /*
        //1.按照索引遍历
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        */

        //增强for
        for (int element : arr)
        {
            //element存储每次循环的元素
            System.out.println(element);
        }

        System.out.println("--------------------------------");

        //增强for + 数组索引
        int index = 0;
        for (int ele : arr)
        {
            System.out.println(ele);
            System.out.println(index);
            index++;
        }
    }
}
