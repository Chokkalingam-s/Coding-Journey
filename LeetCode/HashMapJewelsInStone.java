import java.util.HashMap;
public class HashMapJewelsInStone {
        public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> stoneCount=new HashMap<>();
        for(char c : stones.toCharArray())
        {    if(stoneCount.containsKey(c))
              {
                 stoneCount.put(c,stoneCount.get(c)+1);
              }
              else
              {
                 stoneCount.put(c,1);
              }   
        }
        int ans=0;
        for(char c : jewels.toCharArray())
        {
            if(stoneCount.containsKey(c))
            {
                ans+=stoneCount.get(c);
            }
        }
        return ans;    
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    
}
