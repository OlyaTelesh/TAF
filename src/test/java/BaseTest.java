import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)
public class BaseTest {

    protected Calculator calculator = new Calculator();

    @BeforeMethod
    public void beforeMethod() { System.out.println("The result of division is:");
    }
}
