public class SortColorDutchNationalFlagAlgo {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m<=h)
        {
            if(nums[m]==0)
            {
                swap(nums,l++,m++);
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else
            {
                swap(nums, m, h--);
            }
        }

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        SortColorDutchNationalFlagAlgo solution = new SortColorDutchNationalFlagAlgo ();
        solution.sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
