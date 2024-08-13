public class primeinrange {

    public static int prime(int a){
        int counter = 0;
        if(a == 1){
            System.out.println("not prime");
        }
        for(int i = 2 ; i <= a; i++){
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = count +1;
                    break;  
                }
                
            }
            if(count == 0){
                counter++;

            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int n = 8;
        int total = prime(n);
        System.out.println(total);

    }
}
