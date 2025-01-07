import java.util.HashMap;

public class RomanToInteger13 {
    public static Integer func(String str)
    {      HashMap<Character, Integer> map = new HashMap<>();
           map.put('I',1);
           map.put('V',5);
           map.put('X',10);
           map.put('L',50);
           map.put('C',100);
           map.put('D',500);
           map.put('M',1000);
           int res = 0;

           for(int i=0;i<str.length();i++)
           { 
             if(i>0 && map.get(str.charAt(i)) > map.get(str.charAt(i-1)))
             {
                res += map.get(str.charAt(i)) - 2*map.get(str.charAt(i-1));
             }
             else{
                res += map.get(str.charAt(i));
             }
           }

           return res;
    }

    public static void main(String[] args) {
        String str = "MMV";
        System.out.println(func(str));
    }
}
