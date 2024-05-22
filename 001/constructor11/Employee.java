package constructor11;

/*员工类*/
public abstract class Employee
{
    //员工ID
    private String id;
    //员工姓名
    private String name;
    //婚姻状态
    private boolean marryStatus;

    public Employee(String id , String name , boolean marryStatus)
    {
        this.id = id;
        this.name = name;
        this.marryStatus = marryStatus;
    }

    public Employee(String id, String name)
    {
        this(id , name , false);
    }

    //工作内容
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

    public boolean isMarryStatus()
    {
        return marryStatus;
    }

    public void setMarryStatus(boolean marryStatus)
    {
        this.marryStatus = marryStatus;
    }
}
