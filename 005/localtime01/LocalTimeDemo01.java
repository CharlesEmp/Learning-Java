package localtime01;

import java.time.LocalTime;

/*
    LocalDate
        处理年月日
    LocalTime
        处理时分秒毫秒纳秒

    1.获取功能
        static LocalTime now()//获取当前时分秒毫秒
        public int getHour()  //获取小时
        public int getMinute()//获取分钟
        public int getSecond()//获取秒
        public int getNano()  //获取纳秒
    2.设置功能
        static LocalTime of(int hour, int minute, int second)//将时间设置成指定的时分秒
        LocalTime withHour(int hour)    //设置小时
        LocalTime withMinute(int minute)//设置分钟
        LocalTime withSecond(int second)//设置秒
    3.计算判断功能
        LocalTime plusHours(long hoursToAdd)//在原有的时间上加上指定的小时
        boolean isBefore(LocalTime other)   //判断 调用isBefore方法的LocalTime对象中封装的时间是否在传入时间的前面
                                            //若果在，则返回true 如果不在，则返回false
 */
public class LocalTimeDemo01 
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        System.out.println(LocalTime.of(11, 20, 30).plusHours(3));
        LocalTime localTime01 = LocalTime.of(13, 11, 23);
        LocalTime localTime02 = LocalTime.of(15, 12, 23);
        System.out.println(localTime01.isBefore(localTime02));//true 判断01是否在02的时间点之前

    }

    //设置功能
    private static void method02()
    {
        System.out.println(LocalTime.of(12, 10, 30));
        System.out.println(LocalTime.now().withHour(12).withMinute(30).withSecond(03).withNano(00));
    }

    //获取功能
    private static void method01()
    {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
    }
}
