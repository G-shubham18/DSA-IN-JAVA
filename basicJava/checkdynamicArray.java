import java.util.Scanner;

public class checkdynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // this is dynamic array bcz size of array define at run time
        int arr[] = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
