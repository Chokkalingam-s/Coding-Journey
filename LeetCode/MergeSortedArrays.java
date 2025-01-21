public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m-1;
        int r2 = n-1;

        for(int w = m+n-1; w >= 0; w--) {
            if(r1 >= 0 && r2 >= 0) {
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            } else if (r1 >= 0) {
                nums1[w] = nums1[r1--];
            } else {
                nums1[w] = nums2[r2--];
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 5};
        int n = 3;
        
        merge(nums1, m, nums2, n);
        
        System.out.println("Merged array: ");
        for(int i=0; i<nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
    
}
