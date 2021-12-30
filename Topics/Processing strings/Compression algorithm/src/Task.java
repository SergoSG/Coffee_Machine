import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String res = "";
        int cnt = 0;
        char chr = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (chr == str.charAt(i)) {
                cnt++;
            } else {
                res = res.concat(String.valueOf(chr)).concat(String.valueOf(cnt));
                chr = str.charAt(i);
                cnt = 1;
            }
        }
        res = res.concat(String.valueOf(chr)).concat(String.valueOf(cnt));

        System.out.println(res);
    }
}