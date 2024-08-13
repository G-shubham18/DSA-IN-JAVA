import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 7, 8, 9 } };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));

        }
    }
}
