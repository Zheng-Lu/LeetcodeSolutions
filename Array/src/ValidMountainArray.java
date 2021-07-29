public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int peak = 0;
        if(arr.length<=2||arr[0]<=arr[1]){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j]>arr[i]){
                    continue;
                }else{
                    peak = i;
                    break;
                }
            }
        }

        for (int i = peak; i < arr.length; i++){
            for (int j = peak+1; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    continue;
                }else{
                    break;
                }
            }
        }

        return false;
    }
}

