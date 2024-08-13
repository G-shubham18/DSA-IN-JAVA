import java.util.Arrays;

public class returnArray {
    public static void main(String[] args) {
        int ar[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(Arrays.toString(search(ar, 0)));

    }

    static int[] search(int ar[][], int target) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i][j] == 9) {

                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }
}