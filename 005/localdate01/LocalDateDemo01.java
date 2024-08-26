package localdate01;

/*
    jdk8 - jdk21及以后版本处理日期的API类
    LocalDate
        localdate类主要处理年月日 默认格式 ： 年-月-日
      成员方法：
        public static LocalDate now()

        public int getYear() 获取localdate对象中的年份
        public Month getMonth() 获取localdate对象中的月份（封装成month对象）
        public int getMonthValue() 获取localdata对象中的月份值
        public int getDayOfMonth() 获取localdata对象中的日

 */

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo01
{
    public static void main(String[] args)
    {
        //method01();

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        Month month = now.getMonth();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(year + " " + month + " " + dayOfMonth);
        System.out.println(year + " " + now.getMonthValue() + " " + dayOfMonth);
    }

    private static void method01() {
        LocalDate now = LocalDate.now();//获取当前系统的年月日（系统时间）
        System.out.println(now);//2024-08-25当前时间
    }
}
