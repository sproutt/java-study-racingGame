import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SlippTest {
    @Before
    public void setup() {
        System.out.println("setup");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("test1");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("test2");
    }

    @After
    public void teardown() {
        System.out.println("teardown");
    }
}

// 실행순서 setup - test1 - teardown - setup - test2 - teardown