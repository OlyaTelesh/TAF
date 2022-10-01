
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CalcTest extends BaseTest {

    @Test
    public void testDiv() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверное число ...");
    }

    @Test(enabled = false)
    public void testDiv1() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверное число ...");
    }

    @Test(description = "Description of error")
    public void testDiv2() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверное число ...");
    }

    @Test(testName = "New TestName")
    public void testDiv3() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверная сумма...");
    }
/*
    @Test(timeOut = 1000)
    public void waitLongTimeTest() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test (invocationCount = 3, invocationTimeOut = 1000, threadPoolSize = 3)
    public void invocationCountTest() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверная сумма...");
    }

    @Test (dataProvider = "dataForSum", dataProviderClass = StaticProvider.class, threadPoolSize = 3)
    public void testDataProvider(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.sum(a, b), expectedResult, "Неверная сумма...");
    }

    @Test (expectedExceptions = NullPointerException.class)
    public void testExceptions() {
        List list = null;
        int size = list.size();
    }
*/
@Test
public void testDivDouble() {
    Assert.assertEquals(calculator.div(2.4,1.2),2,"Error, number j can't be equals 0");
}

    @Test(enabled = false)
    public void testDivDouble1() {
        Assert.assertEquals(calculator.div(2.4,1.2),2,"Error, number j can't be equals 0");
    }

    @Test(description = "Description of error about double method")
    public void testDivDouble2() {
        Assert.assertEquals(calculator.div(2.4,1.2),2,"Error, number j can't be equals 0");
    }

    @Test(testName = "New DoubleTest")
    public void testDivDouble3() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверная сумма...");
    }
}
