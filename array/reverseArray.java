public class reverseArray {

    public static void reversearr(int arr[]){

        int first = 0;
        int last = arr.length-1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
            
        }
    


    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,11};
        reversearr(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}