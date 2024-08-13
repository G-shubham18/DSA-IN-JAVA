public class palindrom {

    public static int panli(int n){
        int num = 0;
        while ((n > 0)) {
            int digit = n % 10;
            num = num*10 + digit;
            n = n/10;

            
        }
        return num;
        
    }
    public static void main(String[] args) {
        int n = 1331;
        int var = panli(n);
        boolean istrue = true;
        if(var != n){
            istrue = false;
        }
        System.out.println(istrue);
    }
}
