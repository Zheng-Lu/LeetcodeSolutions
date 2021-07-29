public class RemoveDuplicatesfromSortedArr {
    public int removeDuplicates(int[] nums) {

        int length = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==nums[i+1] && i < nums.length -2){
                for (int j = i + 2; j < nums.length; j++) {
                    nums[i]=nums[i+1];
                }
                length--;
            }
        }

        return length;
    }
}
