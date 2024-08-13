public class linearSearchByforloop {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 14, 15, 0, 10, 12, 8 };
        System.out.println(search(arr, 0));

    }

    static int search(int arr[], int target) {
        int count = -1;
        for (int i : arr) {
            count++;
            if (i == target) {
                return count;

            }
        }
        return -1;
    }
}
