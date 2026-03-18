/*
#70 Climbing Stairs


You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

 

Constraints:

    1 <= n <= 45

*/
/*
        // My first instinct was to impliment a recursive solution
        // becasue we know it can only be 2 or 1 step we can manually impliment that in Steps function
        //then we make a recurssive function that adds 
        int ans = Steps(n);
        return ans;

*/

/*
        //My second solution is to utilize that there are only 2 options, 1 or 2 steps
        //because of this we can use an iterative approach, and track the previous 2 solutions
        //for example if n = 30
        //ans 30 = ans 29 + ans 28, so if we calculate ans of 1 - 29 we know 30
        //this is O(n) solution

        int prev2 = 1; //ans 1
        int prev1 = 2; //ans 2
        int ans = 0;

        if(n == 1)  // Returning base case;
        return 1;
        if(n == 2)  // returning base case;
        return 2;

        for(int i = 3; i <= n; i ++)
        {
            ans = prev2 + prev1;
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
*/


class Solution {
    int[] memo;
    public int climbStairs(int n) {
        // The last solution I wanted to do was improve my first recursive method by storing a global array with answers for previous solutions.  
        //this improves time complexity from O(n^2) to O(n)

        memo = new int[n + 1];
        return Steps(n);

    }

    public int Steps(int steps)
    {
        if(memo[steps] != 0) return memo[steps];

        if(steps == 1) return 1;  //base cases
        if(steps == 2) return 2;

        int ans = Steps(steps -1) + Steps(steps -2);
        memo[steps] = ans; //store result in global memo array;
        return ans;
    }
}
