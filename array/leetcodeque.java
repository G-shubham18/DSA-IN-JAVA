public class leetcodeque {
    public static void main(String[] args) {
        int arr[] = { 12, 14, 10, 1134, 2, 6, 7896 };

        System.out.println(count(arr, 0, 0));
        System.out.println(countdigit(arr));
        System.out.println(countno(arr));

    }
    // using brute force method

    static int countdigit(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int inc = 0;
            while (n > 0) {
                inc += 1;
                n = n / 10;

            }
            if (inc % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    // using recursion
    static int count(int arr[], int i, int result) {

        if (i == arr.length) {
            return result;
        }
        int n = arr[i];

        int inc = 0;

        while (n > 0) {
            inc += 1;
            n = n / 10;
        }
        if (inc % 2 == 0) {
            result += 1;
            inc = 0;
        }
        return count(arr, i + 1, result);

    }

    // math function
    static int countno(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int inc = (int) Math.log10(arr[i]) + 1;
            if (inc % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
