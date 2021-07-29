import java.util.Arrays;

public class FindNumWithEvenDigit {
    public static int findNumbers(int[] nums) {
        int[] digits = new int[nums.length];
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int count1 = 0;
            for (int j = 0; j <6; j++){
                if (nums[i] >= Math.pow(10,j)) count1 ++;
                else break;
            }
            digits[i] = count1;
        }

        for (int digit : digits) {
            if (digit % 2 == 0) count2 ++;
        }

        return count2;
    }

    public static void main(String[] args) {
        int[] nums1 = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};
        int[] nums3 = {437,315,322,431,686,264,442};
        int[] nums4 = {1,2,3,4,5,6,7,8,9};
        System.out.println(findNumbers(nums1));
        System.out.println(findNumbers(nums2));
        System.out.println(findNumbers(nums3));
        System.out.println(findNumbers(nums4));


        int[] digits = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int count1 = 0;
            for (int j = 0; j <6; j++){
                if (nums1[i] >= Math.pow(10,j)) count1 ++;
                else break;
            }
            digits[i] = count1;
        }
        System.out.println(Arrays.toString(digits));
    }


}
