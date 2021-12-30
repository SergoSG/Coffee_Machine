import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int[][] table = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                table[i][j] = Math.abs(j - i);
            }
        }
        for (int[] str : table) {
            for (int col : str) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}