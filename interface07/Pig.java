package interface07;

public class Pig extends Animal implements JiDu
{
    @Override
    public void eat()
    {
        System.out.println("啃白菜");
    }

    @Override
    public void voice()
    {
        System.out.println("哼唧");
    }

}
