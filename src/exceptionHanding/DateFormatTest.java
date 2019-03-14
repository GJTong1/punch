package exceptionHanding;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df1 = DateFormat.getInstance();
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE");
        DateFormat df3 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒 EE", Locale.CHINA);
        DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE", Locale.US);
        DateFormat df5 = new SimpleDateFormat("yy-MM-dd");
        DateFormat df6 = new SimpleDateFormat("yy年MM月dd日");
        System.out.println("------------将日期按照不同的格式进行输出------------");
        System.out.println("按照Java默认的日期格式：" + df1.format(date));
        System.out.println("按照Java默认的日期格式：" + df1.format(date));
        System.out.println("按照指定格式 yyyy-MM-dd hh:mm:ss EE，系统默认区域：" + df2.format(date));
        System.out.println("按照指定格式 yyyy年MM月dd日 hh时mm分ss秒 EE，指定区域中国：" + df3.format(date));
        System.out.println("按照指定格式 yyyy-MM-dd hh:mm:ss EE，指定区域美国：" + df4.format(date));
        System.out.println("按照格式 yy-MM-dd：" + df5.format(date));
        System.out.println("按照格式 yy年MM月dd日：" + df6.format(date));
    }
}
