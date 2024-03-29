package extends07;
/*
    画一个形状求出周长和面积
        长方形：
            周长：2*（长+宽）
            面积：长*宽
        正方形：
            周长：4*边长
            面积：边长*边长

    如果这个方法的方法体无法确定，我们需要把这个方法定义为抽象方法
        修饰符 abstract 返回值类型 方法名（形参列表）

    一旦一个类含有抽象方法，则该类必须是抽象类

    抽象类无法创建对象，因为抽象类里面的抽象方法调用没有意义

    抽象类定义一般是作为体系的规范，约束子类必须实现父类的某些方法
    一般不直接使用抽象类，而是通过创建子类对象来使用
 */
public abstract class Shape
{
    //由于形状的不确定性，无法确定求周长|面积的方法体

    //求周常
    public abstract double getPerimeter();

    //求面积
    public abstract double getArea();

}
