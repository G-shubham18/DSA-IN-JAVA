public class EleSearchInRange {
    public static void main(String[] args) {
        int arr[] = { 18, 12, -7, 3, 14, 28 };
        int si = 1;
        int li = 4;
        System.out.println(Searcrange(arr, 3, si, li));

    }

    static boolean Searcrange(int arr[], int target, int si, int li) {

        for (int i = si; i <= li; i++) {

            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
