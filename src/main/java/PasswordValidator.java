public class PasswordValidator {

    public static boolean isLongEnough(String pwd) {

        boolean isLongerThan6;
        isLongerThan6=pwd.length()>6;
        return isLongerThan6;
    }

    public static boolean hasNumber(String pwd) {

        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isDigit(pwd.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLetter(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isAlphabetic(pwd.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(String pwd) {
        return (isLongEnough(pwd)&& hasLetter(pwd)&& hasNumber(pwd));   //oui c'est moche
    }

    public static boolean isLongEnoughAdmin(String pwd) {

        boolean isLongerThan6;
        isLongerThan6=pwd.length()>10;
        return isLongerThan6;
    }

    public static boolean hasSpecChar(String pwd) {
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for (int i = 0; i < pwd.length(); i++) {
            char ch = pwd.charAt(i);
            if (specialCharactersString.contains(Character.toString(ch))) {
                return true;
            }
        }
        return false;
    }

}
