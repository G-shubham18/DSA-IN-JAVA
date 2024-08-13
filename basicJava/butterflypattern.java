public class butterflypattern {

    public static void patt(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= n / 2) {
                    if (j <= i || j > n - i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                if (i > n / 2) {
                    if (j <= n - i + 1 || j >= i) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }
    }

    // another approach
    public static void patt1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i || j > 2 * n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= n - i + 1 || j > n + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 4;
        // patt(n);
        patt1(n);
    }
}
