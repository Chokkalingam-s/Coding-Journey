public class memoizationApproach {
    
    public static int fibonacci(int n,int[] memo)
    {
        if(memo[n]!=0) return memo[n];
        if(n==1||n==2) return 1;
        else return fibonacci(n-1, memo)+fibonacci(n-2, memo);
    }

    public static void main(String[] args)
    { 
        int n = 10;
        int[] memo= new int[n+1];
        System.out.println("Fibonacci series using Memoization approach: ");
        for (int i=1; i<n; i++) {
            System.out.print(fibonacci(i,memo)+" ");
        }
        
        
    }
    
}
