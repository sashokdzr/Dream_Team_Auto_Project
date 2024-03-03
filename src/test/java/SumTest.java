import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {
    @Test
    public void testSumAB(){
        int a =2;
        int b =3;
        Assert.assertEquals(Sum.sumAB(a,b), 5);
    }

    @Test
    public void testDivision(){
        double a =6.0;
        double b =2.0;
        Assert.assertEquals(Operation.div(a,b), 3.0);
    }

    @Test
    public void testDivisionNegative(){
        double a =6.0;
        double b =0;
        Assert.assertEquals(Operation.div(a,b), -1);
    }
    @Test
    public void testDivisionZero(){
        double a =0;
        double b =90;
        Assert.assertEquals(Operation.div(a,b), 0);
    }
}
