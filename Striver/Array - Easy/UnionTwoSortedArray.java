import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionTwoSortedArray {

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
      HashSet <Integer> s=new HashSet<>();
      ArrayList < Integer > Union=new ArrayList<>();
      for (int i = 0; i < n; i++)
        s.add(arr1[i]);
      for (int i = 0; i < m; i++)
        s.add(arr2[i]);
      for (int it: s)
        Union.add(it);
      
      Collections.sort(Union);
      return Union;
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        for (int i = 0; i < Union.size(); i++)
        {
            System.out.print(Union.get(i) + " ");
        }
    }
    
}
