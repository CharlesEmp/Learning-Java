package arraylist01;

/*
    ArrayList底层原理；
        1.ArrayList从名字上推断（Array）底层使用的是数组结构 Object类型
            底层用来存储元素的数组：Object[] elementData
        2.当new ArrayList的时候，底层会创造一个空数组 Object[] elementData = new Object[0];
        3.当首次调用add方法的时候，底层会开辟一个默认容量为10的Object数组 Object[] elementData = new Object[10];
            随后存储第一个元素
 */

import java.util.ArrayList;

public class ArrayListDemo04
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<>();//底层会创建一个长度为0的Object类型的数组 Object[] elementData = {};
        al.add("abc");
        al.add("def");
        al.add("ghi");
        System.out.println(al);

    }
}
