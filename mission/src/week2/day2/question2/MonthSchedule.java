package week2.day2.question2;

public class MonthSchedule {

    private Day[] days;

    public MonthSchedule() {
        days = new Day[31];
        for(int i = 1; i < days.length; i++){
            days[i] = new Day();
        }
    }

    public void input(int day, String work){
        days[day].saveTodayWork(work);
    }

    public String hasWork(int day){
        return days[day].hasWork();
    }
}
