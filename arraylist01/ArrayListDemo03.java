package arraylist01;

/*
    List体系的遍历(迭代)
        1.迭代器遍历
        2.索引遍历(特有)
        3.增强for
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo03
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        al.add("love");
        al.add("sbg");
        for (String s : al)
        {
            System.out.println(s);
        }


    }

    private static void method02() {
        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        al.add("love");
        al.add("sbg");

        for(int i = 0; i < al.size(); i++)
        {
            System.out.println(al.get(i));
        }
    }

    private static void method01() {
        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        al.add("love");
        al.add("sbg");

        for (Iterator<String> iterator = al.iterator(); iterator.hasNext() ; )
        {
            System.out.println(iterator.next());
        }
    }
}
