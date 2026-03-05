class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        int length_ans = gcd(str1.length(), str2.length());
        //System.out.println(length_ans);

        String test_ans = str1.substring(0, length_ans);
        boolean is_gcd = true;
        //System.out.println(test_ans);
        //System.out.println(str1.substring(3, 6));
        for(int i = Math.max(str1.length(), str2.length()); i >= 0; i -= length_ans){
            //System.out.println(i +length_ans);
            //System.out.println(Math.min(str1.length(), str2.length()));
            //System.out.println(test_ans + " : " + str1.substring(i, i+length_ans));
            //System.out.println(test_ans != str1.substring(i, i+length_ans));
            if(str1.length() >= i+length_ans)
                if(!(test_ans.equals(str1.substring(i, i+length_ans)))){
                    return "";
                }
            if(str2.length() >= i+length_ans)
                if(!(test_ans.equals(str2.substring(i, i+length_ans)))){
                    return "";
                }
            //if(!(test_ans.equals(str1.substring(i, i+length_ans)) && test_ans.equals(str2.substring(i, i+length_ans)))){return "";}
        }

        return test_ans;
    }
    private int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}
