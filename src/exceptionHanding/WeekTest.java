package exceptionHanding;
import java.util.Scanner;

public class WeekTest {
    public static void main(String[] args) {
        System.out.println("输入英文的星期小写:");
        //键盘接受输入
        Scanner scanner = new Scanner(System.in);
        Week week1 = Week.getResult(scanner.next());

        //获取枚举值的中文描述
        switch (week1){
            case MONDAY:
                System.out.println("MONDAY    "+week1.getWeekName());
                break;
            case TUESDAY:
                System.out.println("TUESDAY    "+week1.getWeekName());
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY  "+week1.getWeekName());
                break;
            case THURSDAY:
                System.out.println("THURSDAY  "+week1.getWeekName());
                break;
            case FRIDAY:
                System.out.println("FRIDAY  "+week1.getWeekName());
                break;
            case SATURDAY:
                System.out.println("SATURDAY  "+week1.getWeekName());
                break;
            case SUNDAY:
                System.out.println("SUNDAY  "+week1.getWeekName());
                break;
            default:
                System.out.println("MONDAY  "+week1.getWeekName());
                break;

        }
    }
}
