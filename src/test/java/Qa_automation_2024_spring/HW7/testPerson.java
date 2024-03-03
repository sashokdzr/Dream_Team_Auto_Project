package Qa_automation_2024_spring.HW7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testPerson {

    Person man1 = new Person("Denis", 15, "M");
    Person woman1 = new Person("Marta", 23, "W");


    @Test
    public void testGetNameM(){
        Assert.assertEquals(man1.getName(), "Mr. Denis");
    }
    @Test
    public void testGetNameW(){
        Assert.assertEquals(woman1.getName(), "Mrs. Marta");
    }






}
