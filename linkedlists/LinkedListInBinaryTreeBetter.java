package linkedlists;

import linkedlists.Recap.ListNode;
import linkedlists.Recap.TreeNode;

/*

1367. Linked List in Binary Tree
Medium

https://leetcode.com/problems/linked-list-in-binary-tree/

Runtime: 1 ms, faster than 99.11% of Java online submissions for Linked List in Binary Tree.
Memory Usage: 40 MB, less than 10.00% of Java online submissions for
Given a binary tree root and a linked list with head as the first node. 

Return True if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return False.

In this context downward path means a path that starts at some node and goes downwards.

 

Example 1:

Input: head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
Output: true
Explanation: Nodes in blue form a subpath in the binary Tree.  

Example 2:

Input: head = [1,4,2,6], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
Output: true

Example 3:

Input: head = [1,4,2,6,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
Output: false
Explanation: There is no path in the binary tree that contains all the elements of the linked list from head.

 

Constraints:

    1 <= node.val <= 100 for each node in the linked list and binary tree.
    The given linked list will contain between 1 and 100 nodes.
    The given binary tree will contain between 1 and 2500 nodes.

Accepted
10,153
Submissions
25,783

*/
class LinkedListInBinaryTreeBetter {
	
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	 }

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
    public boolean isSubPath(ListNode head, TreeNode root) {
		boolean matches = helper(head, root);
		if(!matches)
			matches = isSubPath(head, root.left) || isSubPath(head, root.right);
		return matches;
	}
	private boolean helper(ListNode head, TreeNode root) {
		if(head == null && root == null)
			return true;
		if(head == null)
			return true;
		if(root == null)
			return false;
		if(head.val != root.val)
			return false;
		return helper(head.next, root.left) || helper(head.next, root.right);
	}

}