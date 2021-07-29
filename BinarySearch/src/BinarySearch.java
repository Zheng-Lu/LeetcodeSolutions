public class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    public static int RecursiveSearch(int arr[], int l, int r, int x) {
        int mid = l + (r - l) / 2;

        if (r < l) {
            return -1;
        }
        // If the element is present at the
        // middle itself
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x){// If element is smaller than mid, then
            return RecursiveSearch(arr, l, mid-1, x);// it can only be present in left subarray return RecursiveSearch(arr, l, mid - 1, x);
        } else { //(arr[mid] < x)
            return RecursiveSearch(arr, mid+1, r, x);
        }
    }


    public static int IterativeSearch(int arr[], int l, int r, int x) {
        int index = -1;

        while (l <= r) {
            int mid = l  + ((r - l) / 2);
            if (arr[mid] < x) {
                l = mid + 1;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else if (arr[mid] == x) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int hi = nums.length-1;
        int lo = 0;
        System.out.println(IterativeSearch(nums,0,hi,9));
    }
}
