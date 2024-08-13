public class sumOfSecondRow {

    public static int sumSecondrow(int arr[][]) {
        int sum = 0;
        for (int col = 0; col < arr[0].length; col++) {

            sum += arr[1][col];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        int result = sumSecondrow(matrix);
        System.out.println(result);
    }
}
