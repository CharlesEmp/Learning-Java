package arraylist01;

/*
    ArrayList 扩容思想
 */

import java.util.ArrayList;

public class ArrayListDemo05
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            al.add("ABC");
        }
        al.add("DEF");
        System.out.println(al);
    }
}
