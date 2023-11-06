import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MathTest2 {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(-195, 195);
    }
    @Test
    public void testAdd() {
        Assert.assertEquals(0, math.add());
    }
}