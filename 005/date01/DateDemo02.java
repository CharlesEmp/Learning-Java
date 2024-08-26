package date01;

import java.util.Date;

/*
    Date类的成员方法
        public long getTime()
            返回自起始时间（1970.01.01.00：00：00） 至 Date对象之间经过的毫秒数（时间）
 */
public class DateDemo02 
{
    public static void main(String[] args)
    {
        //method01();

        long startTime = new Date().getTime();
        for (int i = 0; i < 100000; i++)
        {
            i += 2;
        }
        long endTime = new Date().getTime();
        //startTime 与 endTime 之间的代码执行时间
        System.out.println((endTime - startTime));
        //运算时间长短跟cpu、内存有关
    }

    private static void method01()
    {
        Date date = new Date();//封装的是当前系统时间
        System.out.println(date.getTime());//具体数值
        //自起始时间到当前时间的毫秒数
    }
}
