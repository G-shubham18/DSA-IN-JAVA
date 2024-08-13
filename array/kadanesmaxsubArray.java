public class kadanesmaxsubArray {

    public static void kadanes(int arr[]) {
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            max = Math.max(max, currsum);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(arr);
    }
}