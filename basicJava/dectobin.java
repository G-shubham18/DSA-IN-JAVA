public class dectobin {

    public static void DECtoBIN(int d) {

        int bin = 0;
        int arr[] = new int[1000];
        int i = 0;

        while (d > 0) {
            int digit = d % 2;
            arr[i] = digit;
            i++;
            d = d / 2;

        }
        for (int j = 0; j < i; j++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int a = 6;
        DECtoBIN(a);
    }
}
