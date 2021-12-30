import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int[] array = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i) - '0';
        }
        if (array[0] + array[1] + array[2] == array[3] + array[4] + array[5]) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}