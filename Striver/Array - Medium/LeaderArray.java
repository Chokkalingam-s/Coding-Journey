import java.util.ArrayList;
import java.util.Collections;

// leader is number , which is greater than , numbers present in right side
public class LeaderArray {
        static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int max= Integer.MIN_VALUE;
        for(int i=arr.length -1;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                al.add(arr[i]);
            }
        }
        Collections.reverse(al);
        return al;
    }

    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaderArray = leaders(arr);
        System.out.println("Leaders are: " + leaderArray);
    }
    
}
