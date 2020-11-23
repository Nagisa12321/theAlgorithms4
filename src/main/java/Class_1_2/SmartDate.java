package Class_1_2;

import java.util.Objects;

/************************************************
 * @description ����Date��APIʵ��һ��smartDate����,
 * �����ڷǷ�ʱ���׳�һ���쳣
 * @author jtchen
 * @date 2020/11/22 18:57
 * @version 1.0
 ************************************************/
public class SmartDate {
    private final int day;
    private final int month;
    private final int year;

    public SmartDate(int year, int month, int day) {
        if (isRealDate(year, month, day)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else throw new IllegalArgumentException("Illegal date");
    }

    private boolean isRealDate(int year, int month, int day) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day >= 0 && day <= 31)
                    return true;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day >= 0 && day <= 30)
                    return true;
            case 2:
                //����
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    if (day >= 0 && day <= 29)
                        return true;
                }
        }
        return false;
    }

    public String dayOfTheWeek() {
        int month = this.month;
        int year = this.year;
        if (month <= 2) {
            month += 12;
            year--;
        }
        int week = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400) % 7;
        switch (week) {
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            case 5:
                return "Saturday";
            case 6:
                return "Sunday";
            default:
                return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartDate)) return false;
        SmartDate smartDate = (SmartDate) o;
        return day == smartDate.day &&
                month == smartDate.month &&
                year == smartDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return "SmartDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        SmartDate date = new SmartDate(2000, 2, 29);
        System.out.println(date.toString());
        System.out.println(date.dayOfTheWeek());
        SmartDate date2 = new SmartDate(2019, 2, 29);
    }
}
