import java.io.Serializable;
import java.util.Arrays;

public class SquareSortedArray5 implements Serializable {
    // Merges two subarrays of array[].
    // First subarray is array[l..m]
    // Second subarray is array[m+1..r]
    // l for left, m for middle, r for right
    public static void merge(int[] nums, int l, int m, int r){

        // Find sizes of two subarrays to be merged
        int size1 = m - l + 1;
        int size2 = r - m;

        /* Create temp arrays */
        int L[] = new int[size1];
        int R[] = new int[size2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < size1; ++i)
            L[i] = nums[l + i];
        for (int j = 0; j < size2; ++j)
            R[j] = nums[m + 1 + j];

        // Initial indexes of first and second subarrays, i for L, j for R.
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < size1 && j < size2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            }
            else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < size1) {
            nums[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < size2)  {
            nums[k] = R[j];
            j++;
            k++;
        }

    }


    public static int[] mergeSort(int[] nums, int left, int right){
        if (left < right) {
            // Find the middle point, which is the point where the array is divided into two subarrays
            int middle = left + (right - left)/2;

            // Sort first and second halves
            mergeSort(nums, left, middle);
            mergeSort(nums, middle + 1, right);

            // Merge the sorted halves
            merge(nums, left, middle, right);
        }

        return nums;
    }

    public static int[] sortedSquares(int[] nums) {
        int[] unsorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            unsorted[i] = nums[i]*nums[i];
        }

        return mergeSort(unsorted, 0 , unsorted.length -1);
    }

    public static void main(String[] args) {
        int[] nums = {2,4,3,1,7,5,9,8,6};
        System.out.println(Arrays.toString(sortedSquares(nums)));
        
    }
}
