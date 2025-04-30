package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        String strWeek = null;
        switch(calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY: strWeek = "월"; break;
            case Calendar.TUESDAY: strWeek = "화"; break;
            case Calendar.WEDNESDAY: strWeek = "수"; break;
            case Calendar.THURSDAY: strWeek = "목"; break;
            case Calendar.FRIDAY: strWeek = "금"; break;
            case Calendar.SATURDAY: strWeek = "토"; break;
            default: strWeek = "일";
        }

        String amPm = null;
        if (calendar.get(Calendar.AM_PM) == Calendar.AM)
            amPm = "오전";
        else
            amPm = "오후";

        System.out.println(calendar.get(Calendar.YEAR) + "년 "
                + calendar.get(Calendar.MONTH) + "월 "
                + calendar.get(Calendar.DAY_OF_MONTH) + "일");
        System.out.println(strWeek + "요일 " + amPm);
        System.out.println(calendar.get(Calendar.HOUR) + "시 "
                + calendar.get(Calendar.MINUTE) + "분 "
                + calendar.get(Calendar.SECOND));

    }
}
