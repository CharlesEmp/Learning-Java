package Demo04;
/*
    人类：
        属性：
            姓名|年龄
        行为：
            吃饭

*/

public class Person
{
    //属性 —— 成员变量
    String name;
    int age;

    //行为
    public void eat()
    {
        System.out.println(name + "正在吃饭");
    }
}
