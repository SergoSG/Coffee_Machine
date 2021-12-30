import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        String res = enter.length() % 2 == 0 ?
                enter.substring(0, enter.length() / 2 - 1).concat(enter.substring(enter.length() / 2 + 1)) :
                enter.substring(0, enter.length() / 2).concat(enter.substring(enter.length() / 2 + 1));
        System.out.println(res);
    }
}