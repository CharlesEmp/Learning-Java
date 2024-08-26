package date01;

/*
    Date的构造方法
        public Date()
            封装的是当前系统时间
        public Date(long date)
 */

import java.util.Date;

public class DateDemo01
{
    public static void main(String[] args)
    {
        //method01();

        Date date = new Date(3000);//传入3000毫秒（3秒） 基准时间 1970.01.01 00：00：00
        System.out.println(date);//Thu Jan 01 08:00:03 GMT+08:00 1970
                                 //东八区 用+8h
    }

    private static void method01() {
        Date date = new Date();
        System.out.println(date);//当前时间（动态）
    }
}
