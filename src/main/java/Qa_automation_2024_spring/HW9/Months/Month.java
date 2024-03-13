package Qa_automation_2024_spring.HW9.Months;

public class Month {
    public Month(String monthName, int allDays, int workingDays) {
        this.monthName = monthName;
        this.allDays = allDays;
        this.workDays = workingDays;
    }

    private String monthName;
    private int workDays;
    private int allDays;

    public String getMonthName() {
        return monthName;
    }

    public int getWorkDays() {
        return workDays;
    }

    public int getAllDays() {
        return allDays;
    }
}
