import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    public void isLongEnoughTest() {
        assertFalse(PasswordValidator.isLongEnough("moin6"));
        assertTrue(PasswordValidator.isLongEnough("plusde6char"));
    }

    @Test
    public void hasANumberTest() {

        assertFalse(PasswordValidator.hasANumber("noNumber"));
        assertTrue(PasswordValidator.hasANumber("number42"));
    }
}