package tutorial4;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

public class TestCalc {
    @Test
    public void testAdd(){
        Assertions.assertEquals(42, new Calc().add(40, 2));
    }

    @Test
    public void testSubtract(){
        Assertions.assertEquals(20, new Calc().subtract(40, 20));
    }
}