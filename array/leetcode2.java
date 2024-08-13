public class leetcode2 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 10 },
                { 3, 2, 1 } };
        System.out.println(wealth(arr));
    }

    static int wealth(int arr[][]) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int wealth = 0;
            for (int j = 0; j < arr[i].length; j++) {

                wealth += arr[i][j];
            }
            if (maxWealth < wealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
