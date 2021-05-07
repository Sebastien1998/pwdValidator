import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    public void isLongEnoughTest() {
        assertFalse(PasswordValidator.isLongEnough("moin6"));
        assertTrue(PasswordValidator.isLongEnough("plusde6char"));
    }

    @Test
    public void hasNumberTest() {

        assertFalse(PasswordValidator.hasNumber("noNumber"));
        assertTrue(PasswordValidator.hasNumber("number42"));
    }

    @Test
    public void hasLetterTest() {
        assertFalse(PasswordValidator.hasLetter("556%!?"));
        assertTrue(PasswordValidator.hasLetter("hasletter"));
    }

    @Test
    public void isValidTest() {
        assertFalse(PasswordValidator.isValid("55"));
        assertTrue(PasswordValidator.isValid("va1idPassw0rd"));
    }

    @Test
    public void isLongEnoughAdminTest() {
        assertFalse(PasswordValidator.isLongEnoughAdmin("moin10"));
        assertTrue(PasswordValidator.isLongEnoughAdmin("plusde10char"));
    }

    @Test
    public void hasSpecCharTest() {

        assertFalse(PasswordValidator.hasSpecChar("pasDeCharSpec"));
        assertTrue(PasswordValidator.hasSpecChar("!specChar%;<"));
    }

}