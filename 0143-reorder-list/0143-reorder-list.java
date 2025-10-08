/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        int len =0;
        while(curr != null){
            st.push(curr);
            curr = curr.next;
            len++;
        }
        curr = head;
        for(int i=0;i<len/2;i++){
            ListNode tail = st.pop();
            ListNode next = curr.next;
            curr.next = tail;
            tail.next = next;
            curr = next;
        }
        curr.next = null;
    }
}