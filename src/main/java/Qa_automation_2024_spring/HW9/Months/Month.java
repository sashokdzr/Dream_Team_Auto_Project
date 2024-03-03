package Qa_automation_2024_spring.HW9.Months;

public class Month {
    public Month(String monthName, int allDays, int workingDays) {
        this.monthName = monthName;
        this.allDays = allDays;
        this.workingDays = workingDays;
    }

    private String monthName;
    private int workingDays;
    private int allDays;

    public String getMonthName() {
        return monthName;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public int getAllDays() {
        return allDays;
    }
}
