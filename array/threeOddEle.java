public class threeOddEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 34, 3, 4, 5, 7, 23, 120 };
        System.out.println(check(arr));
    }

    static boolean check(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count = 0;
            } else {
                count++;
            }

            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}
