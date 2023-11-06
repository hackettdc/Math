import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MathTest {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(4, 20);
    }
    @Test
    public void testAdd() {
        Assert.assertEquals(24, math.add());
    }
}
