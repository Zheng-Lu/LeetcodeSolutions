import java.util.Arrays;

public class SquareSortedArray {

    public static int[] insertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i -1;

            while (j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        return nums;
    }

    public static int[] sortedSquares(int[] nums) {
        int[] unsorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
             unsorted[i] = nums[i]*nums[i];
        }

        return insertionSort(unsorted);

    }

    public static void main(String[] args) {
        int[] nums = {2,4,3,1,7,5,9,8,6};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
}
