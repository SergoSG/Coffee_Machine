import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.next();
        int num = scanner.nextInt();

        if (num > originalString.length()) {
            System.out.println(originalString);
        } else {
            System.out.println(originalString.substring(num, originalString.length()).
                               concat(originalString.substring(0, num)));
        }
    }
}