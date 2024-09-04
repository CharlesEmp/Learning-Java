package generic03;

/*
    当类上定义泛型，以及实现的接口也定义泛型
        此时泛型被确定的时机：创建该类对象的时候
 */

public class Son<T> implements Father<T>
{

    @Override
    public void method(T t)
    {
        System.out.println(t);
    }
}
