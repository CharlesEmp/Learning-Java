package hashset;

/*
    HashSet特点：
        1.不能存储重复元素
        2.存储元素的顺序和取出元素的顺序 不一定 一致
        3.没有索引，无法通过索引操作集合
 */
 
public class HashSetDemo02 
{
    public static void main(String[] args)
    {
        Person p1 = new Person("ade", 18);
        Person p2 = new Person("sef", 25);

        System.out.println(p1);//hashset.Person@2f4d3709
        System.out.println(p2);//hashset.Person@4e50df2e

        System.out.println(p1.hashCode());//根据对象的地址值生成HashCode（十进制）
        System.out.println(p2.hashCode());

        System.out.println(Integer.toHexString(p1.hashCode()));//2f4d3709将十进制的哈希值转换成16进制
        System.out.println(Integer.toHexString(p2.hashCode()));//4e50df2e

    }
}
