package wrapclass;

/*
    ==:判断对象地址值
    equals:
    Integer类中的equal方法被重写，比较两个Integer对象中的值
    Byte类型的数据范围：-128 到 127

    装箱缓存机制:
        如果装箱的整数不在byte范围(-128~127之间),底层直接创建该包装类对象new Integer(值)
        如果装箱的整数在byte范围,底层会从一个cache数组中取出对应的Integer对象,相同值取出的Integer对象相同
        Integer[] cache = new Integer[256]
        cache[0]= new Integer(-128);
        cache[1]= new Integer(-127);
        cache[2]= new Integer(-126);
        .....
        cache[254]=new Integer(126)
        cache[255]=new Integer(127)
 */

public class WrapClassDemo04 
{
    public static void main(String[] args)
    {
        Integer i5 = Integer.valueOf(300);//300不在-128~127之间底层直接Integer i5 =new Integer(300)
        Integer i6 = Integer.valueOf(126);//126在 -128~127 之间,底层会从一个缓存数组
                                            //Integer[] cache = new Integer[256] 中取出对应的Integer对象返回


        Integer i1 = 300;// Integer i1 =new Integer(300)
        Integer i2 = 300;// Integer i2 =new Integer(300)
        System.out.println(i1 == i2);     //false
        System.out.println(i1.equals(i2));//true

        Integer i3 = 126;//126从Integer[] cache = new Integer[256]中取出126对应的Integer对象
        Integer i4 = 126;//126从同一个cache数组中取出126对应的Integer对象 i3,i4取出的是同一个对象
        System.out.println(i3 == i4);     //true
        System.out.println(i3.equals(i4));//trie
    }
}
