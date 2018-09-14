// JUnit 4.x 버전

package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void 덧셈() {
        assertEquals(7, cal.add(3,4));
    }

    @Test
    public void 뺄셈() {
        assertEquals(1, cal.subtact(5, 4));
    }

    @Test
    public void 곱셈() {
        assertEquals(6, cal.multiply(2,3));
    }

    @Test
    public void 나눗셈() {
        assertEquals(2, cal.divide(8,4));
    }

    @After
    public void tearDown() {
        cal = null;
    }
}

// @Test : 단위테스트를 수행 할 메소드를 나타내고, 항상 public void 형태이다.
// @Before, @After : 단위테스트 전, 후에 한 번씩 실행되므로 중복 코드를 제거하기 위해 사용한다.
// @BeforeClass, @AfterClass : Test Class 전후처리를 담당하고, public static void 형태를 갖는다.
// @Ignore : 특정 환경에서만 테스트할 때 제외시키기 위한 어노테이션이다.
