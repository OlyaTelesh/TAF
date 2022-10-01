import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
    protected Calculator calculator = new Calculator();

    @Test
    public void firstTest () {
        System.out.println("Hello World");
    }
    @BeforeMethod
    public void beforeMethod() { System.out.println("The result of division is:");
    }
}
