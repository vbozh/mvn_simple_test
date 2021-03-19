import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C2Test {
    C2 c2 = new C2();

    @Test
    public void test_passed() {
        assertTrue("Pew pew".equalsIgnoreCase(c2.s));
    }


}