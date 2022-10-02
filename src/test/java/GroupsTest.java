import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTest extends CalcTest {

    @Test(groups = "smoke")
    public void testDataProvider(double a, double b, double expectedResult) {
        Assert.assertEquals(calculator.div(a, b), expectedResult, "Неверный результат от деления");
    }

    @Test(groups = "regression")
    public void invocationCountDoubleTest() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(calculator.div(2.4, 1.2), 2, "Неверный результат от деления");
    }
}