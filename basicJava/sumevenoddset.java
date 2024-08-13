public class sumevenoddset {
    public static void main(String[] args) {
        int num = 1021425;
        int evensum = 0;
        int oddsum = 0;
        while ((num > 0)) {
            int digit = num % 10;
            if(digit % 2 == 0)
            {
                evensum += digit;

            }else{
                oddsum += digit;
            }
           num = num /10;
            
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
    
}
