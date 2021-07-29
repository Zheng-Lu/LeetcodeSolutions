import java.util.Arrays;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ){
                arr[j] = nums[i];
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {0,20,30,0,0,0,5,2,87,15,0,0,7};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
