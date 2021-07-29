

public class FindMaxConsecutiveOnes {
    public static int MaxConsecutiveOnes(int[] nums) {
        // Hint: Initialise and declare a variable here to
        int count = 0;
        int max = 0;
        // keep track of how many 1's you've seen in a row.
        for (int i = 0; i < nums.length; i++) {
            // Do something with element nums[i].
            if (nums[i] == 1) {
                count++;
                max = Math.max(count,max);
            }
            else count= 0;
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1,1,0};

        System.out.println(MaxConsecutiveOnes(nums));
    }
}

