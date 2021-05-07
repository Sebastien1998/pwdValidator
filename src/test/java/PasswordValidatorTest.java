import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    public void passwordLengthTest() {
        assertFalse(PasswordValidator.isValidPassword("moin6"));
        assertTrue(PasswordValidator.isValidPassword("plusde6char"));
    }

}