package tutorial4;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

public class TestCalc {
    @Test
    public void testAdd(){
        Assertions.assertEquals(42, new Calc().add(40, 2));
    }
}