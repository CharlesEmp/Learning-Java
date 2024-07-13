package innerclass05;
/*
    匿名对象
    new 类名(参数)

    匿名内部类
        new 父类或父接口()
        {
            //重写父类的或者父接口的方法
        }

    匿名内部类的原理
        编译器在编译匿名内部类的时候会帮我们完成以下操作
        1.会生成一个内部类 —— Demo02$1.class 同时会做以下操作
            class Demo02$1 implements Smoke
            {
                public void smoking()
                {
                    System.out.println("饭后一根烟");
                }
            }
        2.会自动创建Demo02$1这个类的对象
            new Demo02$1();

        最终相当于 ——
        class Demo02$1 implements Smoke
        {
            public void smoking()
            {
                System.out.println("饭后一根烟");
            }
        }

        Smoke s = new Demo02$1();//父接口指向实现子类对象(多态)
        s.smoking();

        匿名内部类的作用就是简化代码
*/

public class Demo02 
{
    public static void main(String[] args)
    {
        //method01();

        Smoke s = new Smoke()
        {
            @Override
            public void smoking()
            {
                System.out.println("饭后一根烟");
            }
        };
        s.smoking();

        //验证s引用指向对象使用的匿名内部类是Demo02$1
        System.out.println(s.getClass());//class innerclass05.Demo02$1

        //验证匿名内部类Demo02$1实现的的父接口为Smoke
        System.out.println(s.getClass().getInterfaces()[0]);//interface innerclass05.Smoke

        //验证s指向的是匿名内部类对象 -- Smoke s = new Demo02$1();
        System.out.println(s);//innerclass05.Demo02$1@4e50df2e
    }

    private static void method01() {
        //匿名对象
        //new Student().smoking();

        //匿名内部类
        /*Smoke s = new Smoke()
        {
            @Override
            public void smoking()
            {
                System.out.println("饭后一根烟");
            }
        };
        s.smoking();*/

        new Smoke()
        {
            @Override
            public void smoking()
            {
                System.out.println("饭后一根烟");
            }
        }.smoking();
    }
}
