import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        int cntA = 0;
        int cntB = 0;
        int cntC = 0;

        int i = 0;
        String pass = "";
        Random r = new Random();
        boolean isComplete = false;

        final int one = 1;
        final int two = 2;
        final int three = 3;

        final int minUpperLetter = 65;
        final int maxUpperLetter = 90;

        final int minLowerLetter = 97;
        final int maxLowerLetter = 122;

        final int minNumber = 48;
        final int maxNumber = 57;

        while (i < n) {
            isComplete = cntA >= a && cntB >= b && cntC >= c;
            switch (r.nextInt((three - one) + one) + one) {
                case one:
                    if (i < n && cntA < a || isComplete) {
                        int randomA;
                        do {
                            randomA = r.nextInt((maxUpperLetter - minUpperLetter) + one) + minUpperLetter;
                        } while (i > 0 && pass.charAt(i - 1) == (char) randomA);
                        pass = pass.concat(String.valueOf((char) randomA));
                        cntA++;
                        i++;
                    }
                    break;
                case two:
                    if (i < n && cntB < b || isComplete) {
                        int randomB;
                        do {
                            randomB = r.nextInt((maxLowerLetter - minLowerLetter) + one) + minLowerLetter;
                        } while (i > 0 && pass.charAt(i - 1) == (char) randomB);
                        pass = pass.concat(String.valueOf((char) randomB));
                        cntB++;
                        i++;
                    }
                    break;
                case three:
                    if (i < n && cntC < c || isComplete) {
                        int randomC;
                        do {
                            randomC = r.nextInt((maxNumber - minNumber) + one) + minNumber;
                        } while (i > 0 && pass.charAt(i - 1) == (char) randomC);
                        pass = pass.concat(String.valueOf((char) randomC));
                        cntC++;
                        i++;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(pass);
    }
}