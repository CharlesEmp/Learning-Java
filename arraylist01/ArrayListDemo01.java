package arraylist01;

/*
    ArrayList<E> 中的方法
        public boolean add(E e)：添加元素到列表末尾
        public void add(int index, E element)：将指定元素添加到指定的索引位置，该位置原有元素及之后的元素后移一位

        public E get(int index)：将指定索引位置的元素取出

        public E set(int index, E element)：将指定索引位置的元素设置为新的值，并返回该索引原有的值

        public E remove(int index)：将指定索引位置的元素删除，并返回该索引原有的值
 */

import java.util.ArrayList;

public class ArrayListDemo01 
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        //method03();

        //method04();

        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        al.add("sdfe");
        al.add("evewf");
        System.out.println(al);

        String str = al.remove(2);//返回2索引即将删除的元素
        System.out.println(str);
        System.out.println(al);
    }

    private static void method04() {
        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        al.add("sdfe");
        al.add("evewf");
        System.out.println(al);

        String str = al.set(1, "sigf");//返回1索引原有元素
        System.out.println(str);
        System.out.println(al);
    }

    private static void method03() {
        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        al.add("sdfe");
        al.add("evewf");
        String str = al.get(1);
        System.out.println(str);
        System.out.println(al.get(2));
    }

    private static void method02() {
        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        al.add("def");
        System.out.println(al);//[abc, def]

        al.add(1 , "mk");
        System.out.println(al);//[abc, mk, def]

        al.add(0 , "ll");
        System.out.println(al);//[ll, abc, mk, def]
    }

    private static void method01() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("abc");
        al.add("def");
        al.add("ghi");
        System.out.println(al);
    }
}
