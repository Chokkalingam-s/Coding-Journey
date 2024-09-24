public class ArrayRemoveDuplicate0026{
    
    public static int removeDuplicate(int arr[])
    {   int swap=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {   
                arr[swap]=arr[i];
                swap++;
            }
        }
        return swap;
    }
    
    public static void main(String args[])
    {
       int[] arr= {0,0,1,1,2,3,4,4};
       int swapIndex=removeDuplicate(arr);
       for(int i=0;i<swapIndex;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
}