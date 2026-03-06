// becasue order doesn't matter for the returned function
//make a last value initially at nums.length
//iterate through list and if nums[i] = val swap last and nums[i]
// because of swap if nums[i] == val, we have to decrement i;
// we can also avoid redundant checks by setting the length of the for loop to k
//nice, first submission is better than 100% and 0ms runtime.
//no notes really, this was a pretty self explanitory solution.
//I guess you typically see dynamic loop length in while loops, but this worked out very neatly.
//It was a fun combo of a double pointer though non traditional, and array swapping.  
//After submitting I realized i could have removed the last variable and for the swap function changed last for k-1

class Solution {
    public int removeElement(int[] nums, int val) {
        int temp = -1;
        int last = nums.length -1;
        int k = nums.length;
        for(int i = 0; i < k; i ++)
        {
            if(nums[i] == val)
            {
                temp = nums[i];
                nums[i] = nums[last];
                nums[last] = temp;
                last--;
                k--;
                i--;
            }
            /*
            //help to debug, debug tool locked behind paywall grrr.
            for(int j = 0; j < nums.length; j++)
            {
                System.out.print(nums[j] + ",");
            }
            System.out.print("   : k=" + k);
            System.out.println();
            */
        }
        return k;

    }
}
