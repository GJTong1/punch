package exceptionHanding;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class DateAndTime {

    public static void main(String[] args) {
        //获取今天的年月日信息
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("Year : %d  Month : %d  day : %d  %n", year, month, day);
        //特定日期的处理
        LocalDate dateOfBirth = LocalDate.of(1999, 12, 12);
        System.out.println("Your Date of birth is : " + dateOfBirth);
        //检查周期性事件
        LocalDate dateOfBirth1 = LocalDate.of(2010, 01, 14);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth1.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);


        if(currentMonthDay.equals(birthday)){

            System.out.println("Many Many happy returns of the day !!");

        }else{

            System.out.println("Sorry, today is not your birthday");

        }





        //获取当前时间

        LocalTime time = LocalTime.now();

        System.out.println("local time now : " + time);







        //对当前时间进行一些操作（比如获取一年后的时间、一年前的时间之类的）

        LocalDate previousYear = today.minus(1, ChronoUnit.YEARS);

        System.out.println("Date before 1 year : " + previousYear);



        LocalDate nextYear = today.plus(1,ChronoUnit.YEARS);
        System.out.println("Date after 1 year : " + nextYear);



        //获取当前时间戳，并进行一些操作

        Clock clock = Clock.systemUTC();

        System.out.println("Clock : " + clock);





        //时区的处理

        ZoneId america = ZoneId.of("America/New_York");

        LocalDateTime localtDateAndTime = LocalDateTime.now();

        ZonedDateTime dateAndTimeInNewYork  = ZonedDateTime.of(localtDateAndTime, america );

        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);



        //表示信用卡到期

        YearMonth currentYearMonth = YearMonth.now();

        System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());

        YearMonth creditCardExpiry = YearMonth.of(2019, Month.JANUARY);

        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);



        //计算两个日期之间的天数和月数

        LocalDate java8Release = LocalDate.of(2019, Month.MARCH, 15);

        Period periodToNextJavaRelease = Period.between(today, java8Release);

        System.out.println("Months left between today and Java 8 release : "

                + periodToNextJavaRelease.getMonths() );





        //包含时差信息的日期和时间

        LocalDateTime datetime = LocalDateTime.of(2019, Month.MARCH, 15, 1, 50);

        ZoneOffset offset = ZoneOffset.of("+05:30");

        OffsetDateTime date = OffsetDateTime.of(datetime, offset);

        System.out.println("Date and Time with timezone offset in Java : " + date);



        //使用预定义的格式化工具解析或格式化日期

        String dayAfterTommorrow = "20190316";

        LocalDate formatted = LocalDate.parse(dayAfterTommorrow,

                DateTimeFormatter.BASIC_ISO_DATE);

        System.out.printf("Date generated from String %s is %s %n",

                dayAfterTommorrow, formatted);





        //把日期转换为字符串

        LocalDateTime arrivalDate  = LocalDateTime.now();

        try {

            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy  hh:mm a");

            String landing = arrivalDate.format(format);

            System.out.printf("Arriving at :  %s %n", landing);

        } catch (DateTimeException ex) {

            System.out.printf("%s can't be formatted!%n", arrivalDate);

            ex.printStackTrace();

        }









    }

}