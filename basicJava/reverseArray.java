import java.util.Arrays;

public class reverseArray {

    public static void reverse(int arr[], int si, int li) {

        if (si > li) {
            return;
        }

        int temp = arr[si];
        arr[si] = arr[li];
        arr[li] = temp;
        reverse(arr, si + 1, li - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }
}
