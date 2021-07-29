public class BinarySearchTemplateI {
    /*
    Template #1 is the most basic and elementary form of Binary Search.
    It is the standard Binary Search Template that most high schools or universities use
    when they first teach students computer science.
    Template #1 is used to search for an element or condition
    which can be determined by accessing a single index in the array.
     */
    int binarySearch(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;

        /*
        若 right 初始化为了 nums.size()，那么就必须用 left < right
        而最后的 right 的赋值必须用 right = mid

        如果我们 right 初始化为 nums.size() - 1
        那么就必须用 left <= right，并且right的赋值要写成 right = mid - 1
         */

        int left = 0, right = nums.length - 1;
        while(left <= right){
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) { left = mid + 1; }
            else { right = mid - 1; }
        }

        // End Condition: left > right
        return -1;
    }
}
