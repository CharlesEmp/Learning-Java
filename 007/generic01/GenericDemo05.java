package generic01;

/*
    Collection接口中toArray方法
        public abstract <T> T[] toArray(T[] a);
        返回一个包含此集合中所有元素的数组
        （将集合转成数组）
 */

import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo05
{
    public static void main(String[] args)
    {
       Collection<String> c = new ArrayList<String>();
       c.add("abc");
       c.add("def");
       c.add("ghk");
        String[] strs = new String[c.size()];
        String[] arr = c.toArray(strs);//这里相当于把String[] strs 传给 <T> T[] toArray(T[] a);
                                       //String[] toArray(String[] a)

        for (String s : arr)
        {
            System.out.println(s);
        }
    }
}
