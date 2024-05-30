package static06;

public class YZ 
{
    private double r;
    private double h;

    public YZ(double r, double h)
    {
        this.r = r;
        this.h = h;
    }

    public double getVolume()
    {
        return Constant.PI * r * r * h;
    }
}
