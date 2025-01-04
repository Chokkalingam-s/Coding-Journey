public class NumberClosestToZero {
    public static int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int res = nums[0];
        for(int i:nums)
        { 
          int currDist = Math.abs(i);
          if((currDist<min)||(currDist==min&&i>0)){
              res = i;
              min = currDist;
          }
        }
  
        return res;
      }
    public static int closestToZero(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < Math.abs(min)) {
                min = arr[i];
            } else if (Math.abs(arr[i]) == Math.abs(min)) {
                min = Math.max(min, arr[i]);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -1, -2, -3, -4};
        System.out.println(findClosestNumber(arr));
    }
    
}
