import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
    LogicController logicController;

    @Before
    public void setUp() {
        logicController = new LogicController();
    }

    @Test
    public void 난수생성() {
        int variable = logicController.forwardOrStay();
        assertTrue(variable == 1 || variable == 0);
    }

    @Test
    public void 전체이동수() {
        int variable = logicController.totalMove(3);
        assertTrue(variable >= 0 && variable <= 3);
    }

}
