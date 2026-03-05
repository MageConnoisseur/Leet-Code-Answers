//1365. How Many Numbers Are Smaller Than the Current Number


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       
       //we know that numbers are between 0 and 100
       int[] count = new int[101];

       int[] ans = new int[nums.length];

       // for every num +1 to the count for all numbers above num.
       // this means for 8, index 9-100 in count go +1
       // for 3, 4-100 go +1
       // for the example 6,5,4,8 count would be {0, 0, 0, 0, 0, 1, 2, 3, 3, 4, 4, 4.... 4}
       for(int num:nums)
       {
            for(int i = num + 1; i < count.length; i++)
            {
                count[i] ++;
            }
       }
       //this forms the answer,
       // for every num in nums, it checks count at nums[i] and checks what the value is
       // so for the example above, 
       // i = 0 ; nums = 6, so count[6] = 2
       // i = 1 ; nums = 5, so count[5] = 1
       // i = 2 ; nums = 4, so count[4] = 0
       // i = 3 ; nums = 8, so count[8] = 4
        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = count[nums[i]];
        }

        return ans;
    }
}
