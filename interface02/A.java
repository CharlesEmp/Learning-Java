package interface02;

/*接口中的变量必须初始化才能定义
  接口中的成员变量加的有默认修饰符
    public static final

    static修饰的成员可以通过类名或者接口名直接调用
        接口名/类名 .成员变量名
    final修饰的变量都是常量(只能赋值一次)

*/
public interface A
{
    public static final int  i = 11;
}

class   Demo02
{
    public static void main(String[] args)
    {
        System.out.println(A.i);
        //A.i = 49;
    }
}
