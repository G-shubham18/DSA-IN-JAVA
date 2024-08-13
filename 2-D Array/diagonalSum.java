public class diagonalSum {

    public static int sum(int arr[][]){
        int count = 0;
        /*for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){

                if(i == j  ){
                    count += arr[i][j];
                }
                if( i+j == arr.length-1 && i != j){
                    count += arr[i][j];
                }
            }
        }*/
        for(int i = 0; i< arr.length; i++){
            count += arr[i][i];

            if(i != arr.length-i-1){
                count += arr[i][arr.length-i-1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
         {5,6,7},
         {9,10,11},

        };

        int result= sum(matrix);
        System.out.println(result);
    }
}
