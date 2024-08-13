public class solidrhombus {

    public static void patt(int n){
        for(int  i = 1; i <= n; i++){
            for(int j = 1; j<= 2*n-1; j++){
                if(j>=n-i+1 && j<=2*n-i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // anternate approach
    public static void patt1(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(j <= n-i){
                    System.out.print(" ");
                }
            }
            for(int j = 1; j<=n; j++){
                
                    System.out.print("*");
                
            }
            System.out.println();
            

        }
    }
    public static void main(String[] args) {
        int n = 8;
        patt1(n);
    }
}
