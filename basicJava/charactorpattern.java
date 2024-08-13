public class charactorpattern {
    public static void main(String[] args) {
        int n = 4;
        int count = 65;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print((char)count+"  ");
                count++;

            }
            System.out.println("");
        }
    }
}
