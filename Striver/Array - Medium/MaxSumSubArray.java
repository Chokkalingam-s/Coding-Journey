public class MaxSumSubArray {
    public static long maxSubarraySum(int[] arr, int n) {
        long max = Long.MIN_VALUE; 
        long sum = 0;
        int start = 0;
        int end = 0;
       
        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > max) {
                max = sum;
                end=i;
            }

            if (sum < 0) {
                start=i+1;
                sum = 0;
            }
        }

        for(int i= start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}

