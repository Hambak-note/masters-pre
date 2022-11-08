package week1.day4.question4;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String isValid(){
        DaysPerMonth daysPerMonth = new DaysPerMonth(isLeapYear(year));
        if(year < 1 || month > 12 || month < 1){
            return year + "년 " + month + "월 " + day + "일은 유효하지 않은 날짜입니다.";
        }

        if(day > daysPerMonth.getDay(month) || day < 1){
            return year + "년 " + month + "월 " + day + "일은 유효하지 않은 날짜입니다.";
        }

        return year + "년 " + month + "월 " + day + "일은 유효한 날짜입니다.";
    }

    public boolean isLeapYear(int year){
        if(year%4 == 0){
            if(year % 100 != 0){
                return true;
            }
            if(year % 400 == 0){
                return true;
            }
        }
        return false;
    }

}
