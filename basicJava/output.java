import java.util.*;
public class output {

    public static void main(String[] args) {
        int pen,book,pencil;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pen book and pencil");
        pen = sc.nextInt();
        book = sc.nextInt();
        pencil = sc.nextInt();
        float gst = ((pen + book + pencil)*18)/100;
        float totalCost = pen + book + pencil + gst ;
    
        System.out.print("Total cost of item is " + totalCost);
        


    }
}
