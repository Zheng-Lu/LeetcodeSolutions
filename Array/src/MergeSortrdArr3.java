public class MergeSortrdArr3 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[]=nums1.clone(),i=0,j=0,index=0;
        while(i<m||j<n) {
            if(i<m&&j<n) {
                if(temp[i]<nums2[j]) {
                    nums1[index++]=temp[i++];
                }else {
                    nums1[index++]=nums2[j++];
                }
            }else if(i==m) {
                nums1[index++]=nums2[j++];
            }else {
                nums1[index++]=temp[i++];
            }
        }
    }
}
