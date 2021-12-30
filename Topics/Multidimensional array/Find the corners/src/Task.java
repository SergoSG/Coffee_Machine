
class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        System.out.printf("%d %d", twoDimArray[0][0], twoDimArray[0][twoDimArray[0].length - 1]);
        System.out.println();
        System.out.printf("%d %d", twoDimArray[twoDimArray.length - 1][0],
                                   twoDimArray[twoDimArray.length - 1][twoDimArray[0].length - 1]);
    }
}