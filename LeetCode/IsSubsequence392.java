public class IsSubsequence392 {

    public static boolean isSubsequence(String s, String t) {
        int len1= s.length();
        int len2= t.length();
        if(len1>len2) {return false;}
        int start=0;
        boolean found = false;
        for(int i=0;i<len1;i++)
        {
            int ch=s.charAt(i);
            found = false;
            for(int j=start;j<len2;j++)
            {
                if(ch==t.charAt(j))
                {   found = true;
                    start=j+1;
                    break;
                }

            }
             if(!found)
        {
            return false;
        }
        }
       
        return true;
         
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t)); 
    }
}