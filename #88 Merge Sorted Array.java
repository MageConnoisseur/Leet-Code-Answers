class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //My idea is because both nums1 and nums2 are not decending, we can have a pointer in each array
        //check what is smaller nums1[mpointer] or nums2[npointer] place the smaller one in nums at index
        //The tricky part of this problem is not overwriting values in nums1
        //The easiest solution to this is to have a new array at length n+m and overwrite nums1 after we do all the comparisons.
        //Awesome, this solution beats 100% on my first submission.  Though I the brute force approach is the fastest approach in this case
        //I think this problem would be tougher in a O(1) space solution, though I would think its possible because its a void function rather than a return function
        //Clever, after reading other peoples solutions, if I were to iterate the other way, I could have avoided making a new array because I would still have all of the data i needed
        //That would have cut a lot of the bulk of my code out too because I wouldn't have needed to have all of the extrainius checks and multiple loops
        // I could have just had 1 for loop that checks if nums1pointer >= 0
        
        int index = 0;
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        int[] ans = new int[n+m];
        if(n != 0 && m != 0)
        while(index < m+n)
        {
            if(nums1[nums1Pointer] < nums2[nums2Pointer])
            {
                ans[index] = nums1[nums1Pointer];
                nums1Pointer++;
            }
            else
            {
                ans[index] = nums2[nums2Pointer];
                nums2Pointer++;
            }
            index++;
            if(nums2Pointer >= n || nums1Pointer >= m)
            break;
        }
        if(nums1Pointer < m)
        while(index < m+n)
        {
            ans[index] = nums1[nums1Pointer];
            nums1Pointer++;
            index++;
        }
        if(nums2Pointer < n)
        while(index < m+n)
        {
            ans[index] = nums2[nums2Pointer];
            nums2Pointer++;
            index++;
        }
        for(int i = 0; i< nums1.length; i ++)
        {
            nums1[i] = ans[i];
        }

    }
}
