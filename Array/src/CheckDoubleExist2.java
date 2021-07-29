//Solution 1: two loops
public class CheckDoubleExist2 {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (key == arr[j]*2 || (key == arr[j]/2 && arr[j] % 2 == 0)){
                    return true;
                }
            }
        }
        return false;
    }
}
