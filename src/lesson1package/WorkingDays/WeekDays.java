package lesson1package.WorkingDays;

public class WeekDays {
    private int dayNumber;

    public Days[] getDays() {
        return days;
    }

    private Days days[];

    public WeekDays(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public Object workingHoursUntilEndOfWeek(){
        days = Days.values();
        int returnedValue = (5 - dayNumber) * 12;
        if(returnedValue <= 0) return "Выходной";
        else return returnedValue;

    }
}
