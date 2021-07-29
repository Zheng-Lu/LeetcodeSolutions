public class SortArrByParity {
    public int[] sortArrayByParity(int[] nums) {
        int evenPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                swap(nums,evenPointer++,i);
            }
        }

        return nums;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
