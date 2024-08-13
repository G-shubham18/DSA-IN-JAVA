import java.util.Scanner;

public class binaryTodec {

    public static int BtoD(int b) {
        int decimal = 0;
        int i = 0;
        while (b > 0) {

            int digit = (b % 10) * (int) Math.pow(2, i);
            decimal = decimal + digit;
            i++;
            b = b / 10;

        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter binary No. Then type Y");
            int n = sc.nextInt();
            int dec = BtoD(n);
            System.out.println(dec);

            System.out.println("Do you want to find another decimal No.");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

    }
}
