public class zero1Triangle {

    public static void patt(int n) {

        for (int i = 1; i <= n; i++) {
            int count1 = 1;
            int count2 = 0;
            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {

                    System.out.print(count1);
                    if (count1 == 1) {
                        count1 = 0;
                    } else {
                        count1 = 1;
                    }
                } else {

                    System.out.print(count2);
                    if (count2 == 1) {
                        count2 = 0;
                    } else {
                        count2 = 1;
                    }

                }

            }
            System.out.println();
        }
    }

    // anternate appraoch
    public static void patt1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 != 0) {
                    System.out.print(0);
                }

                if ((i + j) % 2 == 0) {
                    System.out.print("1");

                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        patt(n);
    }
}
