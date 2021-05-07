public class PasswordValidator {

    public static boolean isLongEnough(String pwd) {

        boolean isLongerThan6;
        isLongerThan6=pwd.length()>6;
        return isLongerThan6;
    }

    public static boolean hasANumber(String pwd) {

        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isDigit(pwd.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasALetter(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isAlphabetic(pwd.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
