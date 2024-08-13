import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income");
        int income = sc.nextInt();
        if(income < 500000){
            System.out.println("no tax need to pay");
        }
        else if(500000 < income || income< 100000){
            System.out.println(income*0.2f);

        }
        else{
            System.out.println(income*0.3f);
        }

    }
}
