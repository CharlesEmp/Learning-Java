package innerclass02;
import innerclass02.Person.Heart;//内部类的导入


public class Demo 
{
    public static void main(String[] args)
    {
        //1.创建一个外部类对象
        Person p = new Person();
        //2.调用定义在外部类中的成员方法【该成员方法正好返回的是内部类对象
        Heart heart = p.getHeart();
        //3.调用内部类里的成员方法
        heart.jump();
    }
}
