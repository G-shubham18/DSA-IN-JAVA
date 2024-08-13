public class SumNaturalNo {
    public static void main(String[] args) {
        int count= 1, sum = 0, n = 100;
        while(count <= n){
            sum+= count;
            count++;
        }
        System.out.println(sum);
    }
}
