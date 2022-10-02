
import Data.StaticProvider;
import Data.StaticProviderForInt;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
@Listeners(Listener.class)
public class CalcTest extends BaseTest {

    @Test
    public void testDiv() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверный результат от деления");
    }

    @Test(enabled = false)
    public void testDiv1() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверный результат от деления");
    }

    @Test(description = "Description of error")
    public void testDiv2() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверный результат от деления");
    }

    @Test(testName = "New TestNameInt")
    public void testDiv3() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверный результат от деления");
    }

    @Test(timeOut = 1000)
    public void waitLongTimeTest() throws InterruptedException {
        Thread.sleep(100);
    }

    @Test(invocationCount = 5, invocationTimeOut = 1000, threadPoolSize = 5)
    public void invocationCountIntTest() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверный результат от деления");
    }

    @Test(dataProvider = "dataForDivInt", dataProviderClass = StaticProviderForInt.class, threadPoolSize = 6)
    public void testDataProvider(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.div(a, b), expectedResult, "Неверный результат от деления");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testExceptions() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверный результат от деления");
    }

    @Test
    public void testDivDouble() {
        Assert.assertEquals(calculator.div(2.4, 1.2), 2, "Error, number j can't be equals 0");
    }

    @Test(enabled = false)
    public void testDivDouble1() {
        Assert.assertEquals(calculator.div(2.4, 1.2), 2, "Error, number j can't be equals 0");
    }

    @Test(description = "Description of error about double method")
    public void testDivDouble2() {
        Assert.assertEquals(calculator.div(2.4, 1.2), 2, "Error, number j can't be equals 0");
    }

    @Test(testName = "New DoubleTest")
    public void testDivDouble3() {
        Assert.assertEquals(calculator.div(2, 1), 2, "Неверная сумма...");
    }

    @Test(invocationCount = 5, invocationTimeOut = 1000, threadPoolSize = 5)
    public void invocationCountDoubleTest() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(calculator.div(2.4, 1.2), 2, "Неверный результат от деления");
    }

    @Test(dataProvider = "dataForDivDouble", dataProviderClass = StaticProvider.class, threadPoolSize = 6)
    public void testDataProvider(double a, double b, double expectedResult) {
        Assert.assertEquals(calculator.div(a, b), expectedResult, "Неверный результат от деления");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testExceptionsForDouble() {
        Assert.assertEquals(calculator.div(2.4, 0), 0, "Неверный результат от деления");
    }
}
