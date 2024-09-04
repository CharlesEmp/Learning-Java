package generic04;

/*
    Jdk 5 泛型的优点：
        1，使用泛型可以将运行时期可能出现的问题（如转换类型异常）提升到编译时期
            （报错时机提前，更容易发现错误）
        2.一定程度上避免强制类型转换，可以直接使用集合中元素类型的特有方法

 */

import java.util.ArrayList;
import java.util.Collection;

public class Demo02
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        Collection<String> c = new ArrayList<>();
        c.add("abc");
        c.add("def");
        c.add("ghk");

        for (String s : c)
        {
            //使用泛型后，增强for上面的元素类型也被确定，可以避免强转
            System.out.println(s.charAt(0));
        }
    }

    private static void method02() {
        //泛型指定为String类型，类中所有泛型的位置都会替换成String
        Collection<String> c = new ArrayList<>();
        c.add("abc");
        c.add("def");
        //c.add(123);//直接编译报错，不再会在运行时期报错
        c.add("ghk");

        for (Object o : c)
        {
            String str = (String) o;//为了使用String类的方法，需要强制向下转型
            System.out.println(str.charAt(0));
        }
    }

    private static void method01() {
        //在不指定泛型的情况下，集合中可以存入各种数据类型，在对类型中的元素做类型转换的时候，容易引发类型转换异常
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add(123);//导致类型转换异常 Integer不能转换成String
        c.add("ghk");
        c.add(1.3);

        for (Object o : c)
        {
            String str = (String) o;//为了使用String类的方法，需要强制向下转型
            System.out.println(str.charAt(0));
        }
    }
}
