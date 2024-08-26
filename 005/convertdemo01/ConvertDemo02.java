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
        通过DateTimeFormatter完成转换
        public static DateTimeFormatter ofPattern(String pattern) 指定日期的格式（模式）
            1.将日期对象转换为日期字符串
            public String format(TemporalAccessor temporal)
            2.将日期字符串转化为日期对象
                在三个类中（LocalDate，LocalTime，LocalDateTime）均有
            public static LocalDate parse(CharSequence text)
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertDemo02
{
    public static void main(String[] args)
    {
        //method01();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate ld = LocalDate.parse("2013-12-13" , df);
        System.out.println(ld.getYear());
    }

    private static void method01() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatStr = df.format(now);
        System.out.println(formatStr);
    }
}
