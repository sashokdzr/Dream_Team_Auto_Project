package HW9;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task1Test {

    @Test
    public void testConcat() {
        String [] strings = {"Word1", "Word2", "Word3", " "};
        Assert.assertEquals(Task1.concat(strings[0], strings[1], strings[2], strings[3]),"Word1 Word2 Word3");
    }
    @Test
    public void testConcat1() {
        String [] strings = {"Word1", "Word2"," "};
        Assert.assertEquals(Task1.concat(strings[0], strings[1], strings[2]),"Word1 Word2");
    }
}