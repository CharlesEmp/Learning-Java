package extends06;
/*
    重写和重载的区别
        重载
            public void show (int i)
            {
            }
            public void show (double j)
            {
            }
        重写
            public void method (double j)
            {
            }
            public void method (double j)
            {
            }

    修饰符：
        重载 —— 对修饰符没有要求
        重写 —— 子类的方法权限要 ≥ 父类的方法权限
    返回值类型：
        重载 —— 对返回值类型没有要求
        重写 —— 子类的方法的返回值类型要与父类的返回值类型 保持一致
    方法名：
        重载 —— 两个方法名保持一致
        重写 —— 子类的方法名与被重写的父类的方法名保持一致
    形参列表：
        重载 —— 重载要求两个方法形参列表不一致（个数，类型，类型顺序 至少一个不一致）
        重写 —— 重写要求子类的方法的形参列表与父类的方法的形参列表  保持一致
 */

class Fu
{
    public void method(int i)//1
    {

    }
    public void method(int i , int j)//2
    {

    }
}

class Zi extends Fu
{
    public void method(int i , int j)//3
    {

    }
}

//1和2构成 —— 重载
//2和3构成 —— 重写
//1和3构成 —— 重载 —— 子类的方法3 与 被继承的方法1 构成重载

public class Demo02
{

}
