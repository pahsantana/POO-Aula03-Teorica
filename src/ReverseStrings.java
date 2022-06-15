import java.util.Scanner;

public class ReverseStrings {
    // classes externas acessam
    // Buffer -> Builder
    // Mutável - String imutável - concatenar criar nova
    public static String reverse(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    public static String[] reverseStrArray(String[] strArray) {
        String[] result = new String[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            result[i] = reverse(strArray[i]);
        }

        return result;
    }

    // Metodos estaticos chamam outros - Estruturado
    private static String[] loadArray() {
        Scanner scanner = new Scanner(System.in);
        String[] strArray = new String[scanner.nextInt()];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = scanner.next();
        }
        scanner.close();

        return strArray;
    }

    public static String toString(String[] strArray) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < strArray.length; i++) {
            builder.append(strArray[i]);
            builder.append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        // System.out.println(reverse("programming"));
        // System.out.println(reverse(""));
        String[] strArray = loadArray();
        System.out.println(toString(strArray));
        System.out.println(toString(reverseStrArray(strArray)));
    }
}
