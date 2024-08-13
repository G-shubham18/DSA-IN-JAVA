public class spiralMatrix {

    public static void spiral(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // print top element of matrix
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            } System.out.println();

            // print right side of matrix
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(arr[j][endCol] + " ");
            }

            // print bottom side of matrix
            for (int i = endCol - 1; i >= startCol; i--) {
                
                System.out.print(arr[endRow][i] + " ");
            }

            // print left side of matrix
            for (int i = endRow - 1; i > startRow; i--) {
                System.out.print(arr[i][startCol] + " ");
            }
            System.out.println();

            startRow++;
            endCol--;
            startCol++;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        spiral(matrix);

    }
}
