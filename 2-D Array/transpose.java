public class transpose {

    public static void matrixTranspose(int arr[][]){
        int row = 0; 
        
        while(row < arr.length){
            for(int col = row+1; col < arr[0].length; col++  ){

                int temp = arr[row][col];
                arr[row][col]  = arr[col][row];
                arr[col][row] = temp;
            }
            row++;


        }
    
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 4, 9},
            {11, 4, 3},
            {2, 2, 3}
        };
        matrixTranspose(matrix);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j< matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
        }
    }
    }
}
