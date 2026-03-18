/*
#125 Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

 

Constraints:

    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.


*/


        //We are going to use a 2 pointer technique to solve this
        //Pretty straight forward solution.  first we remove non alphanumeric characters,
        //this was the most annoying part, just knowing the syntax for all of the string manipulation is annoying 
        //the while loop is the actual solution.  
        //it just has 2 points and iterates through from the front and back
        //for example
        //"Race a car"
        //after string manipulation this becomes 
        //"raceacar"
        //first iteration of while loop rp = 7 lp = 0 : r == r = true
        //iter 2 rp = 6, lp = 1 : a == a = true
        //iter 3 rp = 5, lp = 2 : c == c = true
        //iter 4 rp = 4, lp = 3 : e == a = false , returns false
import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder editedString =  new StringBuilder();

        for (int i = 0; i < s.length(); i ++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                editedString.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int rPointer = editedString.length() - 1;
        int lPointer = 0;
        System.out.println(editedString);

        while (rPointer > lPointer)
        {
            if (editedString.charAt(rPointer) != editedString.charAt(lPointer)) return false;

            rPointer --;
            lPointer ++;
        }
        return true;


    }
}
