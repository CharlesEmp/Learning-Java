package localdate01;

/*
    LocalDateDemo成员方法的计算功能
        LocalDate plusYears(long yearsToAdd)//在原有年份基础上，加上指定的年份
        LocalDate minusMonths(long monthsToSubtract)//在原有年份基础上，减去指定的月份

        boolean isLeapYear()//判断是否为闰年 是则true不是则false（被4整除且不被100整除 或 400整除）
        public boolean isEqual(ChronoLocalDate other)


 */

import java.time.LocalDate;

public class LocalDateDemo03
{
    public static void main(String[] args)
    {
        //method01();

        //method02();

        LocalDate now = LocalDate.now();
        LocalDate now02 = LocalDate.of(2024 , 4 , 27);
        System.out.println(now.isEqual(now02));
    }

    private static void method02() {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println(now.isLeapYear());
        System.out.println(now.withYear(2014).isLeapYear());
    }

    private static void method01() {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate now02 = now.plusYears(3);
        System.out.println(now02);

        LocalDate now03 = now.minusMonths(2);
        System.out.println(now03);
    }
}
