import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        String output = enter;
        for (int i = 0; i < 20; i++) {
            output = output.replaceFirst("[aeiouy]{3}", "aa1a");
            output = output.replaceFirst("[^aeiouy0-9]{3}", "bb1b");
        }
        output = output.replaceAll("[^1]", "");

        System.out.println(output.length());
    }
}
