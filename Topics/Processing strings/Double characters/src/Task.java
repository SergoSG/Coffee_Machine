import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inString = scanner.nextLine();
        char[] chars = new char[inString.length() * 2];
        for (int i = 0; i < inString.length(); i++) {
            chars[2 * i] = inString.charAt(i);
            chars[2 * i + 1] = chars[2 * i];
        }
        String outString = String.valueOf(chars);
        System.out.println(outString);
    }
}