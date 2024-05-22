package constructor09;

/*
    super语句主要用来调用父类的构造方法来完成初始化
    在初始化本类的属性之前，先初始化从父类继承的属性
    通过父类初始化共有属性，通过子类初始化自身的特有属性
 */

public class Dog extends Animal
{
    //String name;
    public Dog(String name)
    {
        super(name);
    }
}
