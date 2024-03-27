package extends08;

public abstract class Employee
{
    //员工编号
    private String id;
    //员工姓名
    private String name;
    //由于不同员工 工作内容不同，方法体无法确定，因此要定义为抽象方法
    public abstract void work();

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
