// JUnit 5.x 버전

import org.junit.jupiter.api.*;

public class LifecycleTest {
    @BeforeAll // JUnit 4의 @BeforeClass
    static void initAll() {
        System.out.println("initAll");
    }

    @BeforeEach // JUnit 4의 @Before
    void init() {
        System.out.println("init");
    }

    @Test
    void someTest() {
        System.out.println("someTest");
    }

    @Test
    void anyTest() {
        System.out.println("anyTest");
    }

    @AfterEach // JUnit 4의 @After
    void tearDown() {
        System.out.println("tearDown");
    }

    @AfterAll // JUnit 4의 @AfterClass
    static void tearDownAll() {
        System.out.println("tearDownAll");
    }
}
