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
class maximumtwins {

    public static ListNode reverse(ListNode head){
        ListNode p = null;
        ListNode c = head;

        while(c != null){
            ListNode f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }

    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = reverse(slow);

        int max = Integer.MIN_VALUE;

        ListNode i = head;
        ListNode j = head2;

        while(j != null){
            int sum = i.val + j.val;
            max = Math.max(max, sum);

            i = i.next;
            j = j.next;
        }

        return max;
    }
}

/*

  public static ListNode reverse(Node head){
        ListNode p = null;
        ListNode c = head;
        ListNode f = null;
        
        while(c != null){
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        // code here
      ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        
        ListNode i = head;
        ListNode j = head2;
        while(j!=null){
            if(i.data != j.data) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
 }       */