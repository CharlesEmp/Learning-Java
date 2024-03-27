package extends07;
//长方形
public class Rectangle extends Shape
{
    //长
    double length;
    //宽
    int width;

    @Override
    public double getPerimeter()
    {
        return 2 * (length + width);
    }

    @Override
    public double getArea()
    {
        return length * width;
    }
}
