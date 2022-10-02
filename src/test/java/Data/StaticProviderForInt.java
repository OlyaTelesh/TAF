package Data;

import org.testng.annotations.DataProvider;

public class StaticProviderForInt {

    @DataProvider(name = "dataForDivInt")
    public static Object[][] dataForDivTest() {
        return new Object[][]{
                {-2, -1, 2},
                {0, 0, 0},
                {2, 1, 2},
                {-2, 1, -2},
                {2, -1, -2},
                {2, 1, -2}
        };
    }
}
