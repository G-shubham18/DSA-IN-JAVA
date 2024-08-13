public class trappedWater {

    public static int valumeWater(int arr[]){
        int maxLeftBound[] = new int[arr.length];
        int maxRightBound[] = new int[arr.length];
        maxLeftBound[0] = arr[0];
        maxRightBound[arr.length - 1] = arr[arr.length -1];
        int totalWaterVal = 0;

        for(int i = 1; i< arr.length ; i++){
            if(maxLeftBound[i-1] > arr[i]){
                maxLeftBound[i] =maxLeftBound[i-1];
            }else{
                maxLeftBound[i] = arr[i];
            }
        }
        for(int i = arr.length-2; i >=0 ; i--){
            if(maxRightBound[i+1] > arr[i] ){
                maxRightBound[i] = maxRightBound[i+1];
            }else{
                maxRightBound[i] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            int waterLevel = Math.min(maxLeftBound[i], maxRightBound[i]);
            int trappedWater = waterLevel - arr[i];
            if(trappedWater <= 0){
                totalWaterVal += 0;
            } else{
                totalWaterVal += trappedWater;
            }
        }

        return totalWaterVal;
        

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int result =valumeWater(height);
        System.out.println(result);
        
    }
}
