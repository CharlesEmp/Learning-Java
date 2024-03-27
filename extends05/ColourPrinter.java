package extends05;
/*
    1.print 和 print2中同属打印功能，而且功能之间有相似，代码的复用性较低（无法复用父类代码）
    2.随着打印机功能的不断增强，需要定义更多的print方法，使代码变得繁琐

 */
public class ColourPrinter extends Printer
{
    /*
    public void print2()
    {
        System.out.println("黑白打印");
        System.out.println("彩色打印");
        System.out.println("照片打印");
    }*/

    public void print()
    {
        super.print();
        System.out.println("彩色打印");
        System.out.println("照片打印");
    }

}
