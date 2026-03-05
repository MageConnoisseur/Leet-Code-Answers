import java.util.*;
class Solution {
    public String reverseWords(String s) {
        int index = s.lastIndexOf(' ');
        //System.out.println(index);
        ArrayList<String> SplitString = new ArrayList<>(Arrays.asList(s.split(" ")));
        
        String ans = "";
        for(int i = 0; i < SplitString.size(); i++)
        {
            //System.out.println("here");
            if(SplitString.get(i).equals("") || SplitString.get(i).equals(" ")) 
            {
                SplitString.remove(i);
                i--;
            }
        }
        for(int i = SplitString.size() - 1; i >= 0 ; i--)
        {
            ans += SplitString.get(i).strip();
            if (i != 0) ans+= " ";
        }
        //System.out.println(ans);
        return ans;
    }
    
}
