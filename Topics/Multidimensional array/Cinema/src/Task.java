import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] seats = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seats[i][j] = scanner.nextInt();
            }
        }

        int combo = scanner.nextInt();
        int res = 0;

        for (int i = 0; i < n && res == 0; i++) {
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                if (seats[i][j] == 0) {
                    cnt++;
                } else {
                    cnt = 0;
                }
                if (cnt == combo) {
                    res = i + 1;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}