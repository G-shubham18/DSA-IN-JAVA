public class binarySearch {

    static int binSearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return key;
            }
            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;

    }

    // searching of element using binary search

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
        int key = 7;
        System.out.println(binSearch(arr, key));
    }
}