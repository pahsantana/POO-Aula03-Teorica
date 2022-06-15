import java.util.Scanner;

public class PasswordChecker {
    private static boolean hasMinLength(String s) {
        return s.length() >= 8;
    }

    private static boolean hasAtLeastOneDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasAtLeastOneLowercase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasAtLeastOneUppercase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasAtLeastOneSpecial(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i)) &&
                    !Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPassword(String password) {
        if (!hasMinLength(password)) {
            return false;
        }
        if (!hasAtLeastOneDigit(password)) {
            return false;
        }
        if (!hasAtLeastOneLowercase(password)) {
            return false;
        }
        if (!hasAtLeastOneUppercase(password)) {
            return false;
        }
        if (!hasAtLeastOneSpecial(password)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Password: ");

        var password = scanner.next();

        scanner.close();

        System.out.println(checkPassword(password) ? "Safe" : "Not safe");
    }

}
