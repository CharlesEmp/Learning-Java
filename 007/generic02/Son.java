package generic02;

//String会替换接口上的T，接口中用到T的位置也会被替换成String
public class Son implements Father<String>
{

    @Override
    public void method(String s)
    {
        System.out.println(s);
    }
}
