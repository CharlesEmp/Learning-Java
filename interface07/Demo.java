package interface07;

public class Demo 
{
     public static void main(String[] args)
     {
         Dog dog = new Dog();
         dog.eat();
         dog.voice();
         dog.JiDU();

         System.out.println("------");

         Pig pig = new Pig();
         pig.eat();
         pig.voice();
         pig.JiDU();

         System.out.println("------");

         Sheep sheep = new Sheep();
         sheep.eat();
         sheep.voice();
     }
}
