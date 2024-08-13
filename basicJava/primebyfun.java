public class primebyfun {

    public static void prime(int a) {
        boolean var = true;
        for (int i = 2; i < Math.sqrt(a); i++) {

            if (a % i == 0) {
                var = false;
                break;

            }
        }
        System.out.println(var);
    }

    public static void main(String[] args) {
        int n = 1;

        prime(n);
    }
}
