public class search2d {

    public static boolean searchSorted(int arr[][], int key){

        int row = 0; 
        int col = arr.length -1;
        int startEle = arr[0][arr.length-1];
        
        while( row < arr.length && col >=0){
            if(arr[row][col] == key){
                System.out.println(row + " " + col);
                return true;
                
            }
            else if(arr[row][col] < key){
                row++;
            }else if(arr[row][col] > key){
                col--;
            } 
            
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 100;
        boolean var = searchSorted(matrix, key);
        System.out.println(var);
    }
}
