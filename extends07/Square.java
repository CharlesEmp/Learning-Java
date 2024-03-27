package extends07;
//正方形
public class Square extends Shape
{
    double side;

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
