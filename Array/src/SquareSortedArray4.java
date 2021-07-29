import java.util.Arrays;

public class SquareSortedArray4 {
    public static int[] shellSort(int[] nums){

        for (int interval = nums.length / 2; interval >= 1; interval /= 2){
            for (int i = interval; i < nums.length ; i++) {
                for (int j = i; j >= interval && nums[j] < nums[j-interval]; j -= interval) {
                    int temp = nums[j];
                    nums[j] = nums[j-interval];
                    nums[j-interval] = temp;
                }
            }
        }
        return nums;
    }

    public static int[] sortedSquares(int[] nums) {
        int[] unsorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            unsorted[i] = nums[i]*nums[i];
        }

        return shellSort(unsorted);
    }

    public static void main(String[] args) {
        int[] nums = {2,4,3,1,7,5,9,8,6};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
}
