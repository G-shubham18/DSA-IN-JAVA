public class buyAndsell {

    public static void profit(int arr[]) {
        int buyingPrice = arr[0];
        int sellingPrice;
        int max = 0;

        for (int i = 1; i < arr.length; i++) {

            int profit = 0;
            sellingPrice = arr[i];
            if (buyingPrice < sellingPrice) {
                profit = sellingPrice - buyingPrice;
                max = profit;
            }

        }
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };

    }
}
