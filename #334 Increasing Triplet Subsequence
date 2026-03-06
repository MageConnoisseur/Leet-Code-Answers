        //brute force
/*
        for(int i = 0; i < nums.length; i++)
        {
        int tripletCheck = 1;
        int testValue = nums[i];
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[j] > nums[i] && testValue > nums[j])
                {
                    testValue = nums[j];
                }
                if(testValue<nums[j])
                {
                    testValue = nums[j];
                    tripletCheck++;
                }
                if(tripletCheck == 3)
                return true;
            }
        }
        return false;

*/
//looked at the discussion for ideas on this one, I couldn't find anything better than brute force on my own.
//really nice solution though, definitely will keep this idea in mind for future problems. 
//Think for future problems if there is a check of a limited amount, preset first few checks and adjust as you go
//Then exit if you find that final check.  Cool pattern to rememeber.  
import java.util.*;
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstsmall = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;
        for(int num: nums)
        {
            if(num <= firstsmall)
            {
                firstsmall = num;
            }
            else if (num <= secondsmall)
            {
                secondsmall = num;
            }
            else return true;
        }
        return false;
    }
}
