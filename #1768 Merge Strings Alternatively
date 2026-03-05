class Solution {
    public String mergeAlternately(String word1, String word2) {
        String answer_string = "";
        int i = 0;
        while(i<word1.length() && i<word2.length()){
            answer_string = answer_string + word1.charAt(i);
            answer_string = answer_string + word2.charAt(i);
            i++;
        }
        while(i<word1.length()){
            answer_string = answer_string + word1.charAt(i);
            i++;
        }
        while(i<word2.length()){
            answer_string = answer_string + word2.charAt(i);
            i++;
        }
        return answer_string;
    }
}
