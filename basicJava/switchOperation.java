import java.util.*;
public class switchOperation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter your roll number");
        int rollNo = sc.nextInt();
        switch(rollNo){
            case 16 : {System.out.println("ShubhamPandeyBhai");
            break;}

            case 18 : {System.out.println("ShubhamGupta"); break;}
            case 28 : {System.out.println("RajVishwkarma"); break;}

            default : System.out.println("No Entry found ");
        }*/
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter your operator in symbol");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' : System.out.println(a + b);
                
                break;
            case '-' : System.out.println(a-b); break;   
            case '*' : System.out.println(a*b); break;
            case '/' : System.out.println(a/b);break;

        
            default: System.out.println("ram ram bhai");
                break;
        }
    }
}
