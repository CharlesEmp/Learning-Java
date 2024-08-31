package random;

/*
    Random类：生成随机数
        public Random()
        public int nextInt(int bound)//产生指定范围的随机数( [0,bound) )
 */

import java.util.Random;

public class RandomDemo01
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(10);
        System.out.println(random.nextInt());
    }
}
