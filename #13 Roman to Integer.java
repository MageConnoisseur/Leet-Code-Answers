/*
#13 Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 

Constraints:

    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].

*/
import java.util.*;
class Solution {
    public int romanToInt(String s) {
        //My strategy is to iterate backwards down s and assine it to value,
        //add value to total,
        //if value is ever less than prev value subtract value instead
        //"MXLVIII" = 1048
        //First Value = I, total = 1;
        //Second Value = I, total = 2;
        //Third Value = i, total = 3;
        //4th value = V, total = 8
        //5th value = L, total = 58
        //6th value = x, total = 48;  this is because X is a lower value than L so you subtract rather than add
        //7th value = M, total = 1048;
        //This answer assumes that formatting is conventional for the numerals

        int value = 0;
        int prevval = 0;
        int ans = 0;
        for(int i = s.length() - 1; i >= 0; i--)
        {
            prevval = value;
            switch(s.charAt(i))
            {
                case 'I':
                {
                    value = 1;
                break;
                }
                case 'V': 
                {
                    value = 5;
                    break;
                }
                case 'X':
                {
                    value = 10;
                    break;
                }
                case 'L':
                {
                    value = 50;
                    break;
                }
                case 'C':
                {
                    value = 100;
                    break;
                }
                case 'D':
                {
                    value = 500;
                    break;
                }
                case 'M':
                {
                    value = 1000;
                    break;
                }
            }
            if(prevval > value)
            ans -= value;
            else
            ans += value;
        }

        return ans;
        
    }
}
