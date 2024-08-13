import java.util.*;
import java.math.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your NUmber");

        int num = sc.nextInt();
        int count = 0; 

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count += 1;
            }
            
        }
        if(count == 0){

            System.out.println("prime");
        }else{
            System.out.println("Not prime");
        }
        

    }
}
