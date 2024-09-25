public class MissingNumberInArray {

        public int missingNumber(int[] nums) {
             int sum = 0;
            int total = nums.length * (nums.length + 1) / 2;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return total - sum;
        }

        public static void main(String[] args) {
            MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
            int[] arr = {3, 0, 1};
            System.out.println(missingNumberInArray.missingNumber(arr));
        }
    
    
}
