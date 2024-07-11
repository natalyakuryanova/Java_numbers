package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
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

    @ParameterizedTest
    @ValueSource(ints = {25,100,99,26,50})
    void testNumberInInterval(int num) {
        assertTrue(mainhw.numberInInterval(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {24,101,9,180,17})
    void testNumberOutInterval(int num) {
        assertFalse(mainhw.numberInInterval(num));
    }
}


