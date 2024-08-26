package localdatetime01;

/*
    LocalDate
        处理 年 月 日
    LocalTime
        处理 时 分 秒 毫秒 纳秒
    LocalDateTime
        处理 年 月 日 时 分 秒

    1.获取功能

    2.设置功能

    3.计算判断功能



 */

import java.time.LocalDateTime;

public class LocalDateTime01
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        LocalDateTime dateTime = LocalDateTime.of(2013 , 11 , 12 , 14 , 20);
        LocalDateTime dateTime02 = LocalDateTime.of(2013 , 12 , 12 , 14 , 20);
        System.out.println(dateTime.isEqual(dateTime02));//false

    }

    //2.设置功能
    private static void method02() {
        LocalDateTime dateTime = LocalDateTime.of(2013 , 11 , 12 , 14 , 20);
        System.out.println(dateTime);

        System.out.println(LocalDateTime.now().withHour(15).withMinute(33));
    }

    //1.获取功能
    private static void method01() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
    }
}
