import java.util.*;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do{
        System.out.println("Enter your marks");
        int Marks = sc.nextInt();

        String check = (Marks>33)?"Pass":"Fail";
        System.out.println(check);
        System.out.println("You want again to check your status of result");
        choice = sc.next();
      }while(true);
       
    }
}
