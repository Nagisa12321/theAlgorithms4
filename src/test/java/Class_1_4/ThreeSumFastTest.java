package Class_1_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumFastTest {

    @Test
    public void isOverflow() {
        assertTrue(ThreeSumFast.isOverflow(1233212313, 1231231321));
        assertFalse(ThreeSumFast.isOverflow(1, 2));
    }
}