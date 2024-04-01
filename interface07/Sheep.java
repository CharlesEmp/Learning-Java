package interface07;

public class Sheep extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("啃青草");
    }

    @Override
    public void voice()
    {
        System.out.println("咩咩");
    }
}
