
class MergeTwoLL {

    public static Node merge2List(Node list1, Node list2) {
            Node i = list1;
            Node j = list2;
            Node dummy = new Node(-1);
            Node k = dummy;
            while(i!=null && j!=null){
                if(i.val <= j.val){
                    k.next = i;
                    i = i.next;
                }
                else{
                    k.next = j;
                    j = j.next;
                }
                k = k.next;
            }
            if(i==null) k.next = j;
            else k.next = i;
        return dummy.next;
    }


    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // First Linked List
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        // Second Linked List
        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

 
        Node result = merge2List(list1, list2);

        // Print Merged List
        printList(result);
    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}