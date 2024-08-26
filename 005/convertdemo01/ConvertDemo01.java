package convertdemo01;

/*
    日期对象和日期字符串之间的转换
    JDK8 之前的转换方式
        采用SimpleDateFormat（继承dateformat）

        构造方法
            public SimpleDateFormat(String pattern)

        转换方法
            public final String format(Date date)//将日期对象格式化为字符串
            public Date parse(String source)     //将日期字符串转化成日期对象
    JDK8 之后的转换方式
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDemo01
{
    public static void main(String[] args) throws ParseException {
        //method01();

        //method02();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2013-02-12");
        System.out.println(date.getTime());
    }

    //日期对象 按照某种指定的格式转化为 日期字符串
    private static void method02() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatStr = sdf.format(new Date());//将当前日期按指定格式 格式化为字符串
        System.out.println(formatStr);
    }

    private static void method01() {
        Date date = new Date();
        System.out.println(date);//Mon Aug 26 00:31:17 GMT+08:00 2024
    }
}
