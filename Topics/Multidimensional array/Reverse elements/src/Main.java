
class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            int[] tmp = twoDimArray[i].clone();
            for (int j = 0; j < tmp.length; j++) {
                twoDimArray[i][j] = tmp[tmp.length - j - 1];
            }
        }
    }
}