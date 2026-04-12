class ListNode{
    int val;
    ListNode prev;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

}


public class DoublyLinkedList {
    
}

class DL{
    ListNode head;
    ListNode tail;
    int size;
    

    void InsertFirst(int val){
            ListNode temp = new ListNode(val);

            if(head == null) head = tail = temp;
            else{
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
    }

    void InsertLast(int val){
            ListNode temp = new ListNode(val);
            if(head == null) head = tail = temp;
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
    }
}