public class factbyfun {

    public static int fact(int a){

        if(a == 1|| a==0){
            return  1;
        }

        int ans = a*fact(a-1);
        return ans;
    }
    public static void main(String[] args) {
        int n= 5;
        int result = fact(n);
        System.out.println(result);
        
    }
    
}
