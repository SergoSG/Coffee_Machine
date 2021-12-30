import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String subString = scanner.nextLine();

        int cnt = 0;
        int pos = 0;
        int i = 0;
        do {
            pos = string.indexOf(subString, i);
            if (pos >= 0) {
                cnt++;
                i = pos + subString.length();
            } else {
                i = string.length();
            }
        } while (i < string.length() || pos != -1);
        System.out.println(cnt);
    }
}