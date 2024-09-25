import java.util.HashMap;

public class longestSubArraySumKPositiveNegativeZero {

    public static int lenOfLongSubarrBRUTEFORCE(int A[], int N, int K) {
       
       HashMap<Integer , Integer> hash=new HashMap<> ();
       int len=0;
       int sum=0;
       for(int i=0;i<A.length;i++)
       {
           sum+=A[i];
           if(sum==K)
           {
               len= Math.max(len,i+1);
           }
           int rev = sum-K;
           if(hash.containsKey(rev))
           {
               int len1 = i - hash.get(rev);
               len= Math.max(len,len1);
           }
           if(!hash.containsKey(sum))
           {
             hash.put(sum,i);
           }
       }
       return len;
    }

    public static void main(String[] args) {
        int A[] = {10, 5, 2, 7, 0, 1};
        int N = A.length;
        int K = 15;
        System.out.println(lenOfLongSubarrBRUTEFORCE(A, N, K));
    }


    
}
