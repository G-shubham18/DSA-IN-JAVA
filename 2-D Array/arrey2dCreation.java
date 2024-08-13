import java.util.*;

public class arrey2dCreation {

    public static void search(int arr[][], int key){
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == key){
                    System.out.println("Key present at index : " + i + " " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arry2d[][] = new int[3][3];

        int key = 9;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of array");
        for (int i = 0; i < arry2d.length; i++) {
            for (int j = 0; j < arry2d[0].length; j++) {
                arry2d[i][j] = sc.nextInt();
            }
        }

        search(arry2d, key);

    }
}