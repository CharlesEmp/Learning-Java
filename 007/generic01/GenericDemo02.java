package generic01;

/*
    定义在类上的泛型
        格式：
            class 类名<E,Q,A,...> //<E,Q,A,...>泛型变量
            {
                //在类中可以使用泛型变量
            }
        1.类上泛型可以在类中直接使用
        2.类上泛型通过创建该类的对象指定具体类型
        3.如果创建对象时不指定具体类型，泛型默认会被替换成Object
        4.静态方法不能使用类上泛型，因为静态方法可以通过类名直接调用，无法确定Q的具体类型
 */

public class GenericDemo02 <Q>
{

    public void method(Q q)
    {
        //在方法上使用了类上定义的泛型
        //Q 泛型变量
        //q 变量名
        System.out.println(q);
    }

    /*
        静态方法不能使用类上的泛型
            因为静态方法可以通过类名直接调用，无法确定Q的具体类型
            而非静态方法是通过创建该类的对象，确定泛型的具体类型
     */
    /*public static void method02<Q>
    {

    }*/

    public static void main(String[] args)
    {
        //在声明对象的时候通过<>指定具体类型
        //例如<String>相当于替代掉类上的Q，类上的泛型一旦确定为String
        //类中所有使用Q的地方，也将会被替换成String
        //GenericDemo02<String> gd01 = new GenericDemo02<String>();
        GenericDemo02<String> gd01 = new GenericDemo02<>();//上下等效
        gd01.method("abd");

        GenericDemo02<Integer> gd02 = new GenericDemo02<>();
        gd02.method(123);

        GenericDemo02 gd03 = new GenericDemo02();//如果在创建对象的时候不指定泛型变量的类型，该泛型变量就被替换成Object类型
        gd03.method(1.3);
    }
}
