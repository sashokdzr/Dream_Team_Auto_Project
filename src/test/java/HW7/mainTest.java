package HW7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class mainTest {
    Employee employee1 = new Employee(123.44, "Alex");
    Employee employee2 = new Employee(567.34, "Rob");
    Manager manager1 = new Manager(345.23, "Tony", 32);
    Manager manager2 = new Manager(678.34, "Tom", 12);
    Manager[] managers = {manager1, manager2};
    Employee[] employees = {employee1, employee2};
    main methods = new main();


    @Test
    public void testFindEmployeeByName() {
        String expectedResult="Rob";
        String actualResult=methods.findEmployeeByName(expectedResult, employees);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindEmployeeByNameNegative() {
        String expectedResult="Not found";
        String actualResult=methods.findEmployeeByName("Ken", employees);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindEmployeeBySubName() {
        String expectedResult="Alex";
        String actualResult=methods.findEmployeeBySubName("lex", employees);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountBudget() {
        double expectedResult=690.0;
        double actualResult=methods.countBudget(employees);
        Assert.assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    public void testFindMaxSalary() {
        double expectedResult=567.34;
        double actualResult=methods.findMaxSalary(employees);
        Assert.assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    public void testFindMinSalary() {
        double expectedResult=123.44;
        double actualResult=methods.findMinSalary(employees);
        Assert.assertEquals(expectedResult, actualResult, 0.0001);
    }


    @Test
    public void testFindMinNumberOfSubardinates() {
        int expectedResult=12;
        int actualResult=methods.findMinNumberOfSubardinates(managers);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindMaxNumberOfSubardinates() {
        int expectedResult=32;
        int actualResult=methods.findMaxNumberOfSubardinates(managers);
        Assert.assertEquals(expectedResult, actualResult);
    }

}