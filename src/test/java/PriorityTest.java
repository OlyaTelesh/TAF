import org.testng.annotations.Test;

public class PriorityTest extends BaseTest{

    @Test(priority = 1)
    public void stepb() {
        System.out.println(calculator.div(2.4, 1.2));
    }

    @Test(priority = 2)
    public void stepa2() {
        System.out.println("stepb is ready");
    }

    @Test(priority = 3)
    public void stepa11() {
        System.out.println("END");
    }
}