package constructor11;

public abstract class Maintenance extends Employee
{
    public Maintenance(String id , String name , boolean marryStatus)
    {
        super(id , name , marryStatus);
    }

    public Maintenance(String id, String name)
    {
        super(id, name);
    }
}
