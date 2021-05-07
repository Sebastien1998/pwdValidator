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

    @Test
    public void hasALetterTest() {
        assertFalse(PasswordValidator.hasALetter("556%!?"));
        assertTrue(PasswordValidator.hasALetter("hasletter"));
    }

    @Test
    public void isValidTest() {
        assertFalse(PasswordValidator.isValid("55"));
        assertTrue(PasswordValidator.isValid("va1idPassw0rd"));
    }
}