import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest2 {
    @Test
    public void test2() {
        System.out.println("in test 2");
        Assert.assertFalse(false);
    }
}
