import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        char[][] table = new char[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == j || i + j == dimension - 1 || i == dimension / 2 || j == dimension / 2) {
                    table[i][j] = '*';
                } else {
                    table[i][j] = '.';
                }
            }
        }
        for (char[] str : table) {
            for (char col : str) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}