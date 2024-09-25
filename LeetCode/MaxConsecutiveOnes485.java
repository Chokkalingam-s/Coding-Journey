import java.util.Arrays;

public class MaxConsecutiveOnes485 {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count=1;
            int sec=0;
            if(Arrays.stream(nums).sum()==0) return 0;
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]==nums[i+1] && nums[i]==1)
                {
                     count++;
                }
                else
                {
                    if(sec<count)
                    {
                        sec=count;
                    }
                    count=1;
                }
    
            }
            
            return Math.max(count,sec);
            
        }

        public static void main(String[] args) {
            MaxConsecutiveOnes485 m = new MaxConsecutiveOnes485();
            int[] nums = {1,1,0,1,1,1};
            System.out.println(m.findMaxConsecutiveOnes(nums));
        }
    

    
}