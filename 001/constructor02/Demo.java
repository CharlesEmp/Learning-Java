package constructor02;

public class Demo
{
    public static void main(String[] args)
    {
        //只要new对象，就一定会调用构造方法
        //new person会调用对应的构造方法
        //在构造方法内部将传过来的值赋值给成员变量
        Person02 person = new Person02("char" , 18 , "男");
        System.out.println(person.getName() + " " + person.getAge() + " " + person.getGender());

    }
}
