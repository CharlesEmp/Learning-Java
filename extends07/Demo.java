package extends07;

public class Demo
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.length = 12;
        r.width = 10;
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

        System.out.println("---------");

        Square square = new Square();
        square.side = 16;
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
