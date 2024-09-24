package linkedlist01;

/*
    LinkedList中特有的方法
        1.public void addFirst(E e)：向集合的开头位置添加元素
        2.public void addLast(E e) ：向集合的末尾位置添加元素

        3.public E getFirst()：获取集合开头位置元素
        4.public E getLast() ：获取集合末尾位置元素

        5.public E get(int index)：取出指定位置的元素

        6.public E removeFirst()：移除开头位置的元素，并且返回当前被删除的元素
        7.public E removeLast() ：移除末尾位置的元素，并且返回当前被删除的元素
 */


import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        //method03();

        LinkedList<String> ll = new LinkedList<>()
        {{
            addFirst("abc");
            addLast("def");
            addFirst("ghi");
        }};

        System.out.println(ll);//[ghi, abc, def]
        System.out.println(ll.removeFirst());//ghi
        System.out.println(ll);//[abc, def]
        System.out.println(ll.removeLast());//def
        System.out.println(ll);//[abc]
    }

    private static void method03() {
        LinkedList<String> ll = new LinkedList<>()
        {{
            add("abc");
            add("def");
            add("ghi");
        }};

        String first = ll.getFirst();
        System.out.println(first);//abc

        String last = ll.getLast();
        System.out.println(last);//ghi

        System.out.println(ll.get(1));//def
    }

    private static void method02() {
        LinkedList<String> ll = new LinkedList<>()
        {{
            addLast("abc");
            addLast("def");
            addLast("ghi");
        }};
        System.out.println(ll);//[abc, def, ghi]
    }

    private static void method01() {
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("abc");
        ll.addFirst("def");
        ll.addFirst("ghi");
        System.out.println(ll);//[ghi, def, abc]
    }
}
