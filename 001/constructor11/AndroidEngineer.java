package constructor11;

public class AndroidEngineer extends Development
{
    public AndroidEngineer(String id , String name)
    {
        super(id , name);
    }

    public AndroidEngineer(String id , String name , boolean marryStatus)
    {
        super(id , name , marryStatus);
    }

    public void work()
    {
        //String marryStr = isMarryStatus() ? "已婚" : "未婚" ;
        System.out.println("员工号为：" + getId() + "的" + (isMarryStatus() ? "已婚" : "未婚")  + "的" + getName() + "员工，正在研发淘宝手机客户端软件");
    }
}
