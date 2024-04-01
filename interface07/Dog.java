package interface07;

public class Dog extends Animal implements JiDu
{
    @Override
    public void eat()
    {
        System.out.println("啃骨头");
    }

    @Override
    public void voice()
    {
        System.out.println("汪汪");
    }

}
