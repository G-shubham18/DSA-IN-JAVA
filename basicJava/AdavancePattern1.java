public class AdavancePattern1 {

    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        patt(row, col);
    }

    // * * * * *
    // * *
    // * *
    // * * * * *

    static void patt(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }

    }
}
