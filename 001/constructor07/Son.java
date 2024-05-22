package constructor07;

/*
    Super语句：
        1.在所有的构造方法的第一行默认会有一个Super语句，必须放在构造方法的第一行
          如果手动添加super语句，就不再有默认的super语句
        2.super语句主要用来调用父类的构造方法
 */

public class Son extends Father
{
    public Son()
    {
        super(13);//默认的super（）语句，会调用父类的空参构造
        System.out.println("Son的空参构造");
    }
}
