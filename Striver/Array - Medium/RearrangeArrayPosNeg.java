public class RearrangeArrayPosNeg {
    public int[] rearrangeArray(int[] nums) {

        int pos=0;
        int neg=1;
        int[] arr=new int[nums.length];
        for(int i : nums)
        {
            if(i>=0)
            {
                arr[pos]=i;
                pos+=2;
            }
            else
            {
                arr[neg]=i;
                neg+=2;
            }
        }

        return arr;
        
    }

    public static void main(String[] args) {
        RearrangeArrayPosNeg obj=new RearrangeArrayPosNeg();
        int[] arr={1,2,-3,-4,-5,6,-7,8};
        int[] res=obj.rearrangeArray(arr);
        for(int i : res)
        {
            System.out.print(i+" ");
        }
    }
    
}
