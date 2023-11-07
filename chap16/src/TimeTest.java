import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dt=LocalDateTime.now();

        System.out.println("오늘 날짜: "+date);
        System.out.println("현재 시간: "+time);
        System.out.println("현재 날짜와 시간 :"+dt);

        //현재 시간을 알고 싶다면?
        String s= dt.getYear()+"년";
        s+=dt.getMonthValue()+"월";
        s+=dt.getDayOfMonth()+"일";
        s+=dt.getDayOfWeek()+"";
        s+=dt.getHour()+"시";
        s+=dt.getMinute()+"분";
        s+=dt.getSecond()+"초";
        System.out.println("현재 날짜와 시간"+s);

        //100일 후는?
        System.out.println("오늘부터 100일 기념일은:"+date.plusDays(100));
        //10주 후는?
        System.out.println("오늘부터 10주 후의 날짜: "+date.plusWeeks(10));
        

    }
}
