/*
35. Search Insert Position
Easy

https://leetcode.com/problems/search-insert-position/

Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Search Insert Position.


Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2

Example 2:

Input: [1,3,5,6], 2
Output: 1

Example 3:

Input: [1,3,5,6], 7
Output: 4

Example 4:

Input: [1,3,5,6], 0
Output: 0

Accepted
547,937
Submissions
1,318,475

*/
class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        	
		int i;
		for (i = 0; i < nums.length; i++) {
			if(nums[i] == target)
				return i;
			if(nums[i] > target)
				return i;
		}
		return i;
    		
    	
    	/*
    	
    	this solution works
    	
    	int i;
        for (i = 0; i < nums.length && nums[i] < target ; i++);
        return i;
        */
    	
    	/*
        int position = -1;
        boolean found = false;
        int i;
        for(i= 0; i < nums.length && nums[i] <= target && !found; i++){
            if(nums[i] == target){
                position = i;
                found = true;
            }
        }
        if(found)
            return position;
        return i;
        */
    }
}
