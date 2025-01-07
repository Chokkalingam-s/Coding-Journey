public class NumberOnceOtherTwice136 {
    public int singleNumber(int[] nums) {

        int ans=0;
        for(int i: nums)
        {
            ans ^= i;
        }
        return ans;
        
    }

    public static void main(String[] args) {
        NumberOnceOtherTwice136 obj = new NumberOnceOtherTwice136();
        int[] nums = {4,1,2,1,2};
        System.out.println(obj.singleNumber(nums));
    }

    
}