package static06;

public class Demo
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea());

        YZ yz = new YZ(2 , 1);
        System.out.println(yz.getVolume());
    }
}
