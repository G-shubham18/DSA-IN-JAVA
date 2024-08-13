public class GratestNo {

    public static void main(String[] args) {
        int a = 10, b = 25, c = 45;
        int result = GratestEle(a, b, c);
        System.out.println(result);
    }

    static int GratestEle(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;

        } else {
            return c;
        }
    }
}