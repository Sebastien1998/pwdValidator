public class PasswordValidator {

    public static boolean isValidPassword(String pwd) {

        boolean isLongerThan6;
        isLongerThan6=pwd.length()>6;
        return isLongerThan6;
    }
}
