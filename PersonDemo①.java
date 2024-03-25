package Demo04;

public class PersonDemo
{
    public static void main(String[] args)
    {
        //method01();

        Person p = new Person();
        p.name = "Les";
        //p.age = -18;//虽然语法不报错，但是不符合现实客观规律，现实生活年龄不可能有负值


        System.out.println(p.name + " " + p.age);
    }

    public static void method01() {
        //创建对象
        Person p = new Person();

        //给成员赋值
        p.name = "Char";
        p.age = 18;

        //调用方法
        p.eat();
    }

}
