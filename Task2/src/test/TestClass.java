import com.bohdan.Model;
import org.junit.*;

public class TestClass {

    private static Model model;
    private static int lowerBound = 1;
    private static int upperBound = 3;
    private static int number = 47;
    private static int iterations = 1000;

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
    public void processUpperNumberTest() {
        Assert.assertEquals(1, model.process(50));
    }

    @Test
    public void lowerBoundRandTest() {
        boolean key = false;
        for(int i = 0; i < iterations; i++) {
            if(model.rand(lowerBound, upperBound) == (lowerBound + 1)) {
                key = true;
                break;
            }
        }
        Assert.assertTrue(key);
    }

    @Test
    public void upperBoundRandTest() {
        boolean key = false;
        for(int i = 0; i < iterations; i++) {
            if(model.rand(lowerBound, upperBound) == (upperBound - 1)) {
                key = true;
                break;
            }
        }
        Assert.assertTrue(key);
    }

    @Test
    public void outOfUpperRange() {
        boolean key = false;
        for(int i = 0; i < iterations; i++) {
            if(model.rand(lowerBound, upperBound) >= upperBound) {
                key = true;
                break;
            }
        }
        Assert.assertFalse(key);
    }

    @Test
    public void outOfLowerRange() {
        boolean key = false;
        for(int i = 0; i < iterations; i++) {
            if(model.rand(lowerBound, upperBound) <= lowerBound) {
                key = true;
                break;
            }
        }
        Assert.assertFalse(key);
    }

    @AfterClass
    public static void verifyNumberTest() {
        Assert.assertEquals(0, model.process(47));
    }
}
