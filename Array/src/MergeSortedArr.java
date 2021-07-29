import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArr {
    public static void Merge(int[] nums, int l, int m, int r){

        // Find sizes of two subarrays to be merged
        int size1 = m - l + 1;
        int size2 = r - m;

        /* Create temp arrays */
        int[] L = new int[size1];
        int[] R = new int[size2];

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
            Merge(nums, left, middle, right);
        }

        return nums;
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[m+n];
        for(int num : nums1){
            if (num != 0 && nums1.length == m + n){
                list.add(num);
            }
        }

        for(int num : nums2){
            if (num != 0 && nums2.length == n){
                list.add(num);
            }
        }

        for (int i = 0; i < m + n; i++) {
            arr[i] = list.get(i);
        }

        return mergeSort(arr,0, m+n-1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));
    }
}

