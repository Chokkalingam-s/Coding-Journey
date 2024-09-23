import java.util.*;

class StackEx
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> s= new Stack<>();
        int n=sc.nextInt();
        while(n<4)
        {
            if(n==1)
            {
                int n1=sc.nextInt();
                s.push(n1);
                System.out.println(n1+" is pushed onto the stack");
                n=sc.nextInt();
            }
            else if(n==2)
            {   if(s.empty())
                {
                    System.out.println("Stack Underflow");
                }
                else
                {
                System.out.println(s.pop()+" is popped from the stack");
                }
                n=sc.nextInt();
            }
            else{
                if(s.empty())
                {
                    System.out.println("Stack is empty");
                }
                else
                {
                System.out.print("Elements in the stack: ");
                for(int i=s.size()-1;i>=0;i--)
                {
                    System.out.print(s.get(i)+" ");
                }
                System.out.println();
                }
                n=sc.nextInt();
            }
        }
        if(n>4)
        {
            System.out.println("Invalid Choice");
        }
        System.out.println("Exiting the program");
        
    }
}
