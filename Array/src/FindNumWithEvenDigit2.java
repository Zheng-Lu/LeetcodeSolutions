public class FindNumWithEvenDigit2 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (String.valueOf(num).length()%2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {12, 345, 2, 6, 7896};
        int[] nums2 = {555, 901, 482, 1771};
        int[] nums3 = {437, 315, 322, 431, 686, 264, 442};
        int[] nums4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findNumbers(nums1));
        System.out.println(findNumbers(nums2));
        System.out.println(findNumbers(nums3));
        System.out.println(findNumbers(nums4));
    }
}
