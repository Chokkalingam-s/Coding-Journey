public class iterativeApproach {

    public static void fibonacci(int n)
    {   int num1 = 1;
        int num2= 1;
        int temp=0;
        for(int i = 0; i < n; i++)
        {
            System.out.print(num1 + " ");
            temp = num1 + num2;
            num1= num2;
            num2= temp;
        }

    }

    public static void main(String[] args)
    { 
        int n = 10;
        System.out.println("Fibonacci series using iterative approach: ");
        fibonacci(n);
        
        
    }
    
}
