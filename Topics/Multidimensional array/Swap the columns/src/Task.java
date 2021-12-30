import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimX = scanner.nextInt();
        int dimY = scanner.nextInt();
        int[][] table = new int[dimX][dimY];

        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        int col1 = scanner.nextInt();
        int col2 = scanner.nextInt();

        for (int i = 0; i < dimX; i++) {
            int tmp = table[i][col1];
            table[i][col1] = table[i][col2];
            table[i][col2] = tmp;
        }

        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}