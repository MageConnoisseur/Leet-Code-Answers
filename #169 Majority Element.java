/*
#169 Majority Element.java

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 

Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109
    The input is generated such that a majority element will exist in the array.

 
Follow-up: Could you solve the problem in linear time and in O(1) space?
*/

/*
        //I want to do the follow up on my first attempt, but below is the straightforward solution
        //A solution with a hashmap counter is really simple
        Map <Integer, Integer> ansMap = new HashMap<>();
        int maxElemVal = -1 * Integer.MAX_VALUE;
        int maxElemKey = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if(ansMap.containsKey(nums[i]))
            ansMap.put(nums[i], ansMap.get(nums[i]) + 1);
            else
            ansMap.put(nums[i], 0);
        }
        for(Map.Entry<Integer, Integer> entry : ansMap.entrySet())
        {

            if(maxElemVal < entry.getValue())
            {
                maxElemKey = entry.getKey();
                maxElemVal = entry.getValue();
            }
            System.out.println(entry + "   current maxElem = " + maxElemKey);
        }
        return maxElemKey;

*/


import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        //because we know that from the description there will be a majority of 1 value that is over half of the values in nums
        //we can use boyer moores majority count algorithm. this is constant space and linear time

        int ans = Integer.MAX_VALUE;
        int count = 0;

        for(int num : nums)
        {
            if(count == 0)
            {
                count++;
                ans = num;
            }
            else if (ans == num)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        //Normally you have to iterate back through to verify and check that ans would be more than half the values, but the discription already verifies this
        return ans;
    }
}
