package oop;

public class Time {

    // 속성 : 시, 분, 초

    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        // 입력값 hour 가 1~23 사이에 있다면 변경
        // 없으면 리턴
        if (hour < 0 || hour > 23)
            return;

        this.hour = hour;
    }

    public int getMinute() {

        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59)
            this.second = second;
    }

}
