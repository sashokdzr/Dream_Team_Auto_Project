package Qa_automation_2024_spring.HW7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testEmployee {
    Employee em1 = new Employee("Denis", 45, "M", 3500);
    Employee em2 = new Employee("Mark", 23, "M", 2500);

    Employee em3 = new Employee("Denis", 28, "M", 2800);

    String param = "Mark";

    @Test
    public void testIsSameName(){
        Assert.assertEquals(em1.isSameName(em2), false);
    }

    @Test
    public void testIsSameName1(){
        Assert.assertEquals(em1.isSameName(em3), true);
    }
}
