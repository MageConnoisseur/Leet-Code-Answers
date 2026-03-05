 // Brute Force Solution
 /*
    
        List<Integer> ans = new ArrayList <>();
        int n = nums.length;
        //n+1 because list starts at 1 not 0
        for(int i = 1; i < n+1; i++)
        {
            ans.add(i);
        }
        for(int i = 0; i < n; i++)
        {
            //have to cast (Integer) so it removes value not index
            ans.remove((Integer)nums[i]);
        }
        return ans;
*/

//this is my originally submitted solution, but I saw a great idea in the discussion that I wanted to impliment because I thought it was clever
/*
        Map <Integer, Integer> ansMap = new HashMap<>();
        //needs to be inclusive for nums.length and also start at 1
        // Can do a frequency map because we know that each value in nums is not going to be larger than nums.length
        // we have to populate the whole map because the method I am using is going to check for every key that has a value of 0 in the key value pair of the map
        for(int i = 1; i <= nums.length; i++)
        {
            ansMap.put(i,0);
        }
        for(int i = 0; i < nums.length; i++)
        {
            ansMap.put(nums[i],ansMap.get(nums[i]) + 1);
        }
        List <Integer> ans = new ArrayList<>();
        //this for loop checks each key to see if the value is 0, if it is, add key to answer list
        for(int i = 1; i <= ansMap.size(); i++)
        {
            if(ansMap.get(i) == 0)
            ans.add(i);
        }
        return ans;
*/
import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //This solution takes advantage of the fact that n <= nums.length, so we can flip to negative at each index if the value of that index is within nums[]
        //I found this idea in the discussion on the porblem after I submitted, and I wanted to impliment my own version of this idea
        //It is a really elegant solution
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            int idx = Math.abs(nums[i]);
            if(nums[idx - 1] > 0)
            {
                nums[idx - 1] = nums[idx-1]* -1;
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                ans.add(i+1);
            }
        }
        return ans;
    }
}
