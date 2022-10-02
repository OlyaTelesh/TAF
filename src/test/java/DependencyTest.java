import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest extends BaseTest{

    @Test
    public void number2() {
        System.out.println("Результат от деления чисел равен: " + calculator.div(2.4,1.0));
    }

    @Test
    public void number1() {
        System.out.println("Результат от деления чисел равен: " + calculator.div(2,3));
    }

    @Test (dependsOnMethods = "number1", alwaysRun = true)
    public void number4() {
        System.out.println("метод Number1 выполнен без ошибок");}

    @Test (dependsOnMethods = {"number1", "number2"})
    public void number3() {
        System.out.println("Методы number1 и number2 выполнены успешно");}
}
