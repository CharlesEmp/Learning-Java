package static06;

public class Circle
{
    private double r;

    public Circle (double r)
    {
        this.r = r;
    }

    public double getArea()
    {
        return Constant.PI * r * r;
    }
}
