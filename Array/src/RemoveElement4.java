import java.util.*;

public class RemoveElement4 {
    public List<Object> removeElement(int[] nums, int val) {
        int targetPointer = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                swap(nums, targetPointer++, i);
                count++;
            }
        }

        for (int i = 0; i < count; i++) {

        }

        return Arrays.asList(nums.length, nums);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};


    }
}
