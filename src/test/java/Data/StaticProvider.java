package Data;

import org.testng.annotations.DataProvider;

public class StaticProvider {

    @DataProvider(name = "dataForDivDouble")
    public static Object[][] dataForDivTest() {
        return new Object[][]{
                {-2.4, -1.2, 2.0},
                {0.0, 0.0, 0.0},
                {2.4, 1.2, 2.0},
                {-2.4, 1.2, -2.0},
                {2.4, -1.2, -2.0},
                {2.4, 1.2, -2.0}
        };
    }
}
