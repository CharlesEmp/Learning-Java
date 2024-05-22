package constructor11;

public abstract class Development extends Employee
{
    public Development(String id , String name , boolean marryStatus)
    {
        super(id , name , marryStatus);
    }

    public Development(String id, String name)
    {
        super(id, name);
    }
}
