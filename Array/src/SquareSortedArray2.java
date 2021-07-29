import java.util.Arrays;

public class SquareSortedArray2 {

    public static int[] selectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            // Initialise the index of minimum element in unsorted array
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) min = j;
            }
            // Swap the found minimum element with the first element
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static int[] sortedSquares(int[] nums) {
        int[] unsorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            unsorted[i] = nums[i]*nums[i];
        }

        return selectionSort(unsorted);

    }

    public static void main(String[] args) {
        int[] nums = {2,4,3,1,7,5,9,8,6};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
}
