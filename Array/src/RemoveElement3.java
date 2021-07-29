public class RemoveElement3 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int count = 0;
        if(length == 0) return 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            } else{
        }
        }
        return count;
    }
}
