public class BinarySearchLeetCode {

    public int search(int[] nums, int target) {
        int r = nums.length - 1;
        int l = 0;
        int index = -1;

        while (l <= r) {
            int mid = l  + ((r - l) / 2);
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
