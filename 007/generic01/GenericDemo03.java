package generic01;

/*

 */

import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo03
{
    public static void main(String[] args)
    {
        //Collection c = new ArrayList();
        //Collection<String> c = new ArrayList<String>();
        Collection<String> c = new ArrayList<>();
        c.add("abc");
        c.add("def");
        //c.add(1123);//add的类型已经被确定为String

        //Collection c = new ArrayList<String>();//写法虽然不报错，但无法确定泛型的基本类型
        //c.add("def");//add的形参类型依然为Object
    }
}
