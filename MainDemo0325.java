package Demo02;
/*
    常见对象的格式
        类名 引用变量名 = new 类名();

    成员变量的使用
        赋值格式 引用变量名.成员变量名 = 值

    成员方法使用格式
        引用变量名.方法名(值1，值2，......)
*/
public class MainDemo
{
    public static void main(String[] args)
    {
        Demo d = new Demo();

        d.x = 50;

        d.method(45);
    }
}
