package object01;

/*
    1.当输出一个引用或对象的时候使用，默认会调用toString()方法
    2.Object类中的toString()方法
        public String toString()
        {
            return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
        }

        ① this.getClass().getName()//获取Person对象所有用的类的完全限定名（包名+类名）
        ② Integer.toHexString(hashCode())
            hashCode()：内存地址值的哈希值（内存地址值——>哈希算法 == 哈希值）
            toHexString(hashCode())：将哈希值转换成十六进制数
*/

public class Demo 
{
    public static void main(String[] args)
    {
        Person p = new Person("wang", 30);
        System.out.println(p);//object01.Person@2f4d3709
        System.out.println(p.toString());//object01.Person@2f4d3709
    }
}
