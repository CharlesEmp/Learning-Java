package hashset;

/*
    HashSet简单使用
        特点：
            1.不能存储重复元素
            2.存储元素的顺序和取出元素的顺序 不一定 一致
            3.没有索引，无法通过索引操作集合
 */

import java.util.HashSet;

public class HashSetDemo01 
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<>();
        hs.add("abc");
        hs.add("abc");
        hs.add("ghi");
        hs.add("def");
        System.out.println(hs);//[abc, def, ghi]
    }
}
