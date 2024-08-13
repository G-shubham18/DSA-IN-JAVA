public class maxSumSub {
    public static int maxsubArr(int arr[]){
        int max= Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0;  i< arr.length; i++){
            int start =i;
            for(int j = i; j < arr.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){

                    currSum += arr[k];
                }
                if(currSum > max){
                    max = currSum;

                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};

        int result = maxsubArr(arr);
        System.out.println(result);

    }
}
