import java.util.Arrays;

public class SquareSortedArray7 {



        public static int[] sortedSquares(int[] nums) {
            int[] unsorted = new int[nums.length];
            for (int i = 0; i < nums.length; i++){
                unsorted[i] = nums[i]*nums[i];
            }

            return null;
        }

        public static void main(String[] args) {
            int[] nums = {2,4,3,1,7,5,9,8,6};
            System.out.println(Arrays.toString(sortedSquares(nums)));
        }
    }

