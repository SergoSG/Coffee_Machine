import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        boolean isSymmetric = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                isSymmetric = table[i][j] == table[j][i];
                if (!isSymmetric) {
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        System.out.println(isSymmetric ? "YES" : "NO");
    }
}