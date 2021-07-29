public class ValidMountainArray2 {
    public boolean validMountainArray(int[] arr) {
        int lo = 0;
        int hi = arr.length-1;
        if (arr.length <3 || arr[0]>= arr[1] || arr[hi] > arr[hi-1]){
            return false;
        }
        while (arr[lo]<arr[lo+1] && lo <= hi){
            lo++;
        }
        while (arr[hi]<arr[hi-1] && hi >= lo){
            hi--;
        }
        return lo == hi;
    }

}
