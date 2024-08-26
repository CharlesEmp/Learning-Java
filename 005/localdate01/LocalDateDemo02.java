package localdate01;

/*
    LocalDateDemo成员方法的设置功能
    static LocalDate of(int year, int month, int dayOfMonth)
    //自定义年月日

    LocalDate withYear(int year)//设置指定日期的年
    LocalDate withMonth(int Month)//设置指定日期的月
    LocalDate withDayOfYear(int DayOfYear)//设置这一年的第几天
    LocalDate withDayOfMonth(int DayOfMonth)//设置日

 */

import java.time.LocalDate;

public class LocalDateDemo02
{
    public static void main(String[] args)
    {
        //method01();

        LocalDate localDate = LocalDate.now().withYear(2014).withMonth(3).withDayOfMonth(13);
        System.out.println(localDate);

        System.out.println(localDate.withDayOfYear(10));//设置当前年起第10天
    }

    private static void method01() {
        LocalDate localDate = LocalDate.of(2016 , 10 , 23);
        System.out.println(localDate);


        LocalDate localDate02 = localDate.withYear(2015);//返回值对象包含新的年份
        System.out.println(localDate);
        System.out.println(localDate02);

        LocalDate localDate03 = localDate02.withMonth(12).withDayOfMonth(15);
        System.out.println(localDate03);
    }
}
