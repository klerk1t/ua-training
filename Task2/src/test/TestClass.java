import com.bohdan.Model;
import org.junit.*;

public class TestClass {

    private static Model model;
    private static int lowerBound = 0;
    private static int upperBound = 100;
    private static int number = 47;

    @BeforeClass
    public static void executeTest() {
        model = new Model(lowerBound, upperBound);
        model.setNumber(number);
    }

    @Test
    public void processLowerNumberTest() {
        Assert.assertEquals(2, model.process(22));
    }

    @Test
    public void processUperNumberTest() {
        Assert.assertEquals(1, model.process(50));
    }

    @AfterClass
    public static void upperBoudTest() {
        Assert.assertNotEquals(upperBound, model.getUpperBound());
    }

    @AfterClass
    public static void lowerBoundTest() {
        Assert.assertNotEquals(lowerBound, model.getLowerBound());
    }

    @AfterClass
    public static void verifyNumberTest() {
        Assert.assertEquals(0, model.process(47));
    }
}
