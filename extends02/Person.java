package extends02;

public class Person
{
    //姓名
    private String name;
    private String  gender;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    /*
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    */

    //吃饭
    public void eat()
    {
        System.out.println(name + "吃饭");
    }

}
