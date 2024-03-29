package arrays;

/*

922. Sort Array By Parity II
Easy

https://leetcode.com/problems/sort-array-by-parity-ii/

Runtime: 2 ms, faster than 99.65% of Java online submissions for Sort Array By Parity II.
Memory Usage: 39.9 MB, less than 90.18% of Java online submissions for Sort Array By Parity II.

Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

 

Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Example 2:

Input: nums = [2,3]
Output: [2,3]

 

Constraints:

    2 <= nums.length <= 2 * 104
    nums.length is even.
    Half of the integers in nums are even.
    0 <= nums[i] <= 1000

 

Follow Up: Could you solve it in-place?
Accepted
158,325
Submissions
224,148

*/
public class SortArrayByParityII {
	
	public int[] sortArrayByParityII(int[] nums) {

		int start = 0, end = nums.length - 1, pointer = 0;
		while(pointer <= end) {
			if(nums[pointer] % 2 == 0) {
				int tmp = nums[start];
				nums[start] = nums[pointer];
				nums[pointer] = tmp;
				start++;
				pointer++;
			}
			else {
				int tmp = nums[end];
				nums[end] = nums[pointer];
				nums[pointer] = tmp;
				end--;
			}
		}
		
		start = 1; 
		end = nums.length - 2;
		while(start < end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start += 2;
			end -= 2;
		}
        
        return nums;
	}

	public int[] sortArrayByParityIIV2(int[] nums) {

		int start = 0;
		int end = nums.length - 1;
		// move odd numbers to right side of array
		while(end > start){
			if(nums[start] % 2 != 0){
				int tmp = nums[end];
				nums[end] = nums[start];
				nums[start] = tmp;
				end--;
			}
			else
				start++;
		}

		start = 1; // first number is even
		end = nums.length - 2; // last number is odd
		while(start < end){
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start += 2;
			end -= 2;
		}
		return nums;
	}
	
	public int[] sortArrayByParityIIV3(int[] nums) {

		int start = 0, end = nums.length - 1;
		while (start < end) {
			if (nums[start] % 2 == 0)
				start++;
			else if (nums[end] % 2 != 0)
				end--;
			else {
				int tmp = nums[end];
				nums[end] = nums[start];
				nums[start] = tmp;
				start++;
				end--;
			}
		}

		start = 1;
		end = nums.length - 2;
		while (start < end) {
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start += 2;
			end -= 2;
		}

		return nums;
	}
}
