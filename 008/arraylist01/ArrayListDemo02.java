package arraylist01;

/*
    集合添加元素的第二种写法

 */

import java.util.ArrayList;

public class ArrayListDemo02
{
    public static void main(String[] args)
    {
        //method01();

        //method02();


    }

    private static void method02() {
        //双大括号形式初始化集合
        ArrayList<String> al = new ArrayList<>()
        {
            {
                add("abc");
                add("def");
                add("ghi");
            }
        };
        System.out.println(al);
    }

    private static void method01() {
        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        System.out.println(al);
    }
}
