package normalclass;

/*
    子类继承父类的属性也会存放在子类对象空间中
    引用类型做参数传递本质上传递的是对象的地址值
*/

public class Demo01
{
    public static void main(String[] args)
    {
        Worker worker = new Worker();
        worker.name = "Wang";
        method01(worker);
        method02(new Worker());
    }

    //自定义引用类型worker作为形参
    public static void method01 (Worker w)
    {
        System.out.println(w.name);
    }

    //自定义引用类型person作为形参（父类）
    public static void method02 (Person p)
    {
        //Person p = new Worker()父类引用指向子类对象，多态思想
        System.out.println(p.name);
    }
}
