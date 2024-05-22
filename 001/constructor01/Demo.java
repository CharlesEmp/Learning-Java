package constructor01;

/*
    从设计角度来讲，人一出生就应该具有姓名和年龄
 */

public class Demo 
{
    public static void main(String[] args)
    {
        Person person = new Person();

        System.out.println(person.getName() + " " + person.getAge() + " " +person.getGender());

        //设置值
        person.setAge(100);
        person.setName("char");
        person.setGender("男");

        System.out.println(person.getName() + " " + person.getAge() + " " +person.getGender());
    }
}
