package innerclass03;

/*
    内部类 访问 外部类 成员
*/

public class Demo 
{
    //外部类的成员变量
    private int number = 11;

    class Inner
    {
        //内部类的成员变量
        private int number = 5;

        public void method()
        {
            //局部变量
            int number = 27;
            System.out.println(number);//就近原则
            System.out.println(this.number);//this 调用的是成员number —— Inner类的成员变量number
                                            //this 是内部类的this
            System.out.println(Demo.this.number);//通过Demo.this 获取到外部类this,通过这个this访问外部类成员
        }
    }

    public static void main(String[] args)
    {
        new Demo().new Inner().method();
    }
}
