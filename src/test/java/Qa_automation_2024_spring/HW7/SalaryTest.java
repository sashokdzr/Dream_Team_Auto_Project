package Qa_automation_2024_spring.HW7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTest{
    Salary sal = new Salary();
    Employee em1 = new Employee("Denis", 45, "M", 3500);
    Employee em2 = new Employee("Mark", 23, "M", 2500);
    Employee em3 = new Employee("Denis", 28, "M", 2800);
    Employee[] employees = new Employee[]{em1, em2, em3};
    Employee[] employees1 = new Employee[]{em1, em2};
    @Test
    public void testGetSum() {
        Assert.assertEquals(sal.getSum(employees), 8800);
    }
    @Test
    public void testGetSum1() {
        Assert.assertEquals(sal.getSum(employees1), 6000);
    }
}