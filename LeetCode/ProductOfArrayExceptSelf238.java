public class ProductOfArrayExceptSelf238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] li=new int[nums.length];
        li[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            li[i]=nums[i-1]*li[i-1];
        }
        int[] ans=new int[nums.length];
        ans[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--)
        {
               ans[i]=ans[i+1]*nums[i+1];
        }
        ans[nums.length-1]=li[nums.length-1];
        for(int i=0;i<nums.length-1;i++)
        {
            ans[i]*=li[i];
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] ans=productExceptSelf(nums);
        for(int i: ans)
        {
            System.out.print(i+" ");
        }
    }
}
