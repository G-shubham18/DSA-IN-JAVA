public class linearSearchAraay {

    public static void LinearSearch(int n[]){
        for(int  i= 0; i<n.length; i++){
            int key = 5;
            if(n[i] == key){
                System.out.println("yes item is present at index : " +i);
            }

        }
    }
    public static void main(String[] args) {
        int num[] = {1,4,5,8,9,5,10,11};
        LinearSearch(num);
    }
}
