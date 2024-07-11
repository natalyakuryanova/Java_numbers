package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.*;


class SomeServiceTest {
   // 3.1.
    private MainHW mainhw;

    @BeforeEach
    void setUp() {mainhw = new MainHW();}

    @ParameterizedTest
    @ValueSource(ints = {2,40,6,-8,0})
    void testEvenOddNumberTrue(int num) {
        assertTrue(mainhw.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,17,-1,11, 29})
    void testEvenOddNumberFalse(int num) {
        assertFalse(mainhw.evenOddNumber(num));
    }

    void multipleThreeNotFiveReturnsFizz(int n) {
        // assertEquals...
    }

}