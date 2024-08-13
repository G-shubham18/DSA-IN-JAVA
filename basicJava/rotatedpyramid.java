public class rotatedpyramid{

    public static void patt(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1; j <=n; j++){
                if(j >= n-i+1){

                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n = 50;
        patt(n);

    }
}
