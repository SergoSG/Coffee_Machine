import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        if (strings.length > 0) {
            int maxI = 0;
            for (int i = 0; i < strings.length; i++) {
                maxI = strings[i].length() > strings[maxI].length() ? i : maxI;
            }
            System.out.println(strings[maxI]);
        }
    }
}