public class factorial {
    public static void main(String[] args) {
        int n = 50;
        int  fact = 1;
        if(n==1 || n ==0){
            System.out.println("1");
        }
        else{
            while (n>0) {
                fact = fact * n;
                n--;
                
            }
            System.out.println(fact);;
        }
    }
}
