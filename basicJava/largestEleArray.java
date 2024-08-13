public class largestEleArray {

    public static void large(int n[]){
        int largest = n[0];
        int smallest = Integer.MAX_VALUE;

        for(int i = 1; i <n.length; i++){
            if(n[i] > largest){
                largest=n[i];
            }
            if(n[i] < smallest){
                smallest = n[i];
            }
        }
        System.out.println("largest : " + largest);
        System.out.println("smallest : " + smallest);
        
    }
    public static void main(String[] args) {
        int arr[] = {42, 2, 5, 9, 11, 18};
        large(arr);
        
    }
}
