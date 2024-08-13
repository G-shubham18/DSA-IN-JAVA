public class smallestVal {

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 4 };
        System.out.println(minDifference(arr));
    }

    static int minDifference(int[] nums) {
        if (nums.length <= 3) {
            return 0;
        }
        int i = 0;
        while (i < 3) {

            int m = findMax(nums);
            int mi = findMin(nums);
            nums[m] = nums[mi];
            i++;
        }
        int m = findMax(nums);
        int mi = findMin(nums);
        return nums[m] - nums[mi];
    }

    static int findMax(int nums[]) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {

                max = nums[i];
                index = i;
            }
        }
        return index;
    }

    static int findMin(int nums[]) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {

                min = nums[i];
                index = i;
            }
        }
        return index;

    }
}