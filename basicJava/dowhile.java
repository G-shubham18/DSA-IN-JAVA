import java.util.*;;
public class dowhile {
    public static void main(String[] args) {
        int n = 10;
        Scanner sc = new Scanner(System.in);
       do{
        System.out.println("Enter the your ");
        int num = sc.nextInt();
        if (num%10 != 0) {
            continue;
            
        }
        else{
            System.out.println(num);
        }
        
       }while(true);
        
       }
    }

