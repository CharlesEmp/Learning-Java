package constructor11;

public class NetworkMaintenanceEngineer extends Maintenance
{
    public NetworkMaintenanceEngineer(String id , String name)
    {
        super(id , name);
    }

    public NetworkMaintenanceEngineer(String id , String name , boolean marryStatus)
    {
        super(id , name , marryStatus);
    }

    public void work()
    {
        //String marryStr = isMarryStatus() ? "已婚" : "未婚" ;
        System.out.println("员工号为：" + getId() + "的" + (isMarryStatus() ? "已婚" : "未婚")  + "的" + getName() + "员工，正在检查网络是否畅通");
    }
}
