/*
        //My idea is becasue nums[i] is between -100 and 100, I can just make a frequency map. 
        //this is probably not the best solution because we know that nums is sorted, but this would technically work for an unsorted array as well.
        //it also just makes more sense to me. 
        //Will have to come up with a different solution.  This works, but I didn't relize answer had to be in non decending order
        //have had similar questions where order doesn't matter, but because it does, maps are unordered, so this doesn't work.
        //actually becasue the input is in order if we switch the hashmap to linked hashmap it perserves the order.  
        //but the whole point of using a map was for the added challenge of making this work on an unordered input, 
        // so this defeats the whole purpose of using a hashmap.  
        // also even though this is technically O(n) complexity runtime is 10ms.  I believe this is becasue map get and put functions are expesnive.
        Map <Integer, Integer> freqMap = new LinkedHashMap<>();
        int k = 0;

        for(int i = -100; i <= 100; i++)
        {
            freqMap.put(i, 0);
        }

        for(int i = 0; i < nums.length; i ++)
        {
            freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
        }
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet())
        {
            if(entry.getValue() > 0)
            {
                nums[index] = entry.getKey();
                k++;
                index ++;
            }
        }
        return k;
*/


/*
        //Alright, I am not satisfied with my first solution even though it was accepted.
        //For my next idea, I want to iterate through the list with a counter, and the counter goes up when nums[i] = nums[i+1]
        //this will make it so that I don't need to create space complexity, I can just change in nums
        //actually I relized the counter Idea would make the time complexity O(n log (n)), 
        //{0,0,1,2,4,4}
        // count = 0, curval = 0; nums at count = 0, nums at curval = 0 ; result count++
        // count = 1, curval = 0; nums at count = 0, nums at curval = 0 ; result count++
        // count = 2, curval = 0; nums at count = 1, nums at curval = 0 ; result 

        // alright this is really challenging without adding space complexity, I will solve this with space complexity of O(n) space complexity worst case,
        //then I will look at the discussion board and find ideas to do this in O(1) space.  
        //I know it would be possible if input was array list, but with primitive array and static length it is really challenging. 
        //I am sure there is an algorithm and pattern for it that I do not know.
        
        int k = 1;
        int count = 0;
        int currentVal = 0;
        int swapper = nums.length -1;
        int temp = 0;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 0);
        int index = 0;

        for(int i = 0; i < nums.length; i ++)
        {
            if(nums[currentVal + count] == nums[currentVal])
            {
                count++;
            }
            else
            {
                ans[index++] = nums[currentVal];
                currentVal += count;
                count = 1;
                k++;

            }

            System.out.println(count + ":" + currentVal);
        }
        ans[index] = nums[currentVal];
        for(int i = 0; i < k; i++)
        {
            nums[i] = ans[i];
        }
        return k;
*/


import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        //alright, I slept on it, and I think I figured out how to do this problem
        //I had the right idea to use 2 pointers, I just didn't impliment it right.
        //we can skip the first value becasue it is always unique.
        //start k at 1 beacuse there is always at least 1 unique element in the first postion and we aren't comparing so we will never increment k for it.
        //we only increment k when we swap values, and we will never swap the first or nums[0] value.
        int k = 1;
        int placement = 1;
        for(int i = 1; i < nums.length; i++ )
        {
            if(nums[i] == nums[placement-1])
            continue;
            else
            {
                nums[placement++] = nums[i];
                k++;
            }
        }
        return k;
    }
}
