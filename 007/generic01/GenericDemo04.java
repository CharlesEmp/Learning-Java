package generic01;

/*
    方法上的泛型：
        格式：
        //在方法上定义的泛型，既可以在方法上使用，也可以在方法内使用
            修饰符<泛型> 返回值类型 方法名 (泛型 变量名)
            {

            }
        1.方法上的泛型是通过传参的类型来确定的
        2.方法上的泛型可以用在静态方法上

 */

public class GenericDemo04
{
    public <T> void method(T t)
    {
        System.out.println(t);
    }

    public static <Q> void method02(Q q)
    {
        System.out.println(q);
    }

    public static void main(String[] args)
    {
        GenericDemo04 gd = new GenericDemo04();
        gd.method("abc");//相当于确定了method方法上的泛型T = String   method（String t）
        gd.method(123);//相当于确定了method方法上的泛型T = Integer    method（Integer t）
    }
}
