public class FindMaxConsecutiveOnes2 {
    public static int MaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int num : nums){
            sum = (sum + num) * num;
            max = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,1,1,0};

        System.out.println(MaxConsecutiveOnes(nums));
    }
}
