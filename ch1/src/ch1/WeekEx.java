package ch1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekEx {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 요일에 따라 특정 숫자 반환
        // 월(1)
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());
        Week today = null;

        // Week.SATUDAY
        switch (dayOfWeek.getValue()) {
            case 1:
                today = Week.MONDAY;
                break;

            case 2:
                today = Week.TUESDAY;
                break;

            case 3:
                today = Week.WEDNESDAY;
                break;

            case 4:
                today = Week.THURSDAY;
                break;

            case 5:
                today = Week.FRIDAY;
                break;

            case 6:
                today = Week.SATUDAY;
                break;

            case 7:
                today = Week.SUNDAY;
                break;

            default:
                break;
        }
        System.out.println("오늘 요일은 :" + today);

    }

}
