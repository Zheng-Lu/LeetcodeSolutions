import java.util.Arrays;

public class SquareSortedArray3 {
    public static int[] bubbleSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]){

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
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

        return bubbleSort(unsorted);

    }

    public static void main(String[] args) {
        int[] nums = {2,4,3,1,7,5,9,8,6};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }

}
