import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase(Locale.ROOT);
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if ("g".equals(String.valueOf(str.charAt(i))) || "c".equals(String.valueOf(str.charAt(i)))) {
                cnt++;
            }
        }
        System.out.println((double) cnt / str.length() * 100);
    }
}