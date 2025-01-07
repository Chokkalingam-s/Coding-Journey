public class MergeStringAlternateCharacters1768 {
    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        
        int len= Math.min(len1,len2);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<len;i++)
        {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }

        if(len1>len)
        {
             res.append(word1.substring(len, len1));
        }
        else if(len2>len){
             res.append(word2.substring(len, len2));
        }
       
        return res.toString();
        
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
        String word3 = "ab";
        String word4 = "pqrs";
        System.out.println(mergeAlternately(word3, word4));
        String word5 = "abcd";
        String word6 = "pq";
        System.out.println(mergeAlternately(word5, word6));
    }
}
