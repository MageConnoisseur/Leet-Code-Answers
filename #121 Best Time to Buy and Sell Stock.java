/*

#121 Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 

Constraints:

    1 <= prices.length <= 105
    0 <= prices[i] <= 104


*/


/*

        //I will Do brute force method first.
        int maxSell = 0;

        for(int i = 0; i < prices.length; i++)
        {
            for(int j = i; j < prices.length; j++)
            {
                if(maxSell < prices[j] - prices[i])
                {
                    maxSell = prices[j] - prices[i];
                }
            }
        }
        return maxSell;

*/


class Solution {
    public int maxProfit(int[] prices) {

        //I am going to try and impliment a linear complexity solution
        //I think what I can do is check each value to see if it is lower than minimum
        //if it is then we change the sell, but for each minimum we need to check each value until the new minimum for buy - sell to get max value
        //so for {2, 4, 1, 2}
        // 2 is buy for now, buy is just the lowest value we have seen so far
        // 4, buy is still 2, maxProfit becomes 2
        // 1, buy becomes 1, maxProfit remains 2
        // 2, buy remains 1, maxProfit remains 2
        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;


        for(int i = 0; i < prices.length; i++)
        {
            if(buy > prices[i])
            {
                buy = prices[i];
                continue;  //continue because next check will be checking on itself minimum time save
            }
            if(prices[i] - buy > maxProfit)
            {
                maxProfit = prices[i] - buy;
            }
        }
        return maxProfit;
    }
}
