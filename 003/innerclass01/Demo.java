package innerclass01;

/*
    成员内部类的调用格式：
        外部类名.内部类名 引用变量名 = new 外部类名(参数).new 内部类名(参数)

*/

public class Demo 
{
    public static void main(String[] args)
    {
        //Person.Heart ph = new Person().new Heart();
        //ph.jump();

        new Person().new Heart().jump();


    }
}
