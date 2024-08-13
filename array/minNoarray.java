public class minNoarray {
    public static void main(String[] args) {
        int arr[] = { 18, 12, -7, 3, 14, 28 };

        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
