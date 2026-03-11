import java.util.*;


public class LinkedListCreation {
  //TO DISAPLAY ALL ELEMEMTS IN LINKED LIST
  public static void display(Node head){
    Node temp = head;
    while(temp != null){
    System.out.print(temp.val+" ");
    temp = temp.next; // temp++ as arr
    }
  }
  //TO DISPLAY ALL ELEMENTS BY USING RECURSION
  public static void displayRec(Node head){
  if(head == null) return;
   displayRec(head.next);
   System.out.print(head.val+" ");
  }
  //TO GET ELEMENTS FROM LINKED LIST
  public static int get(Node head, int idx){
    Node temp = head;
    for(int i=1;i<=idx;i++){
      temp = temp.next;
    }
    return temp.val;
  }

//MAIN METHOD
    public static void main(String[] args) {
    Node a = new Node(10); 
    Node b = new Node(20); 
    Node c = new Node(30); 
    Node d = new Node(50); 
    a.next = b;
    b.next = c;
    c.next = d;
    // display(a);
    // displayRec(a);
    System.out.print(get(a,3));
    
    // System.out.println(a.val);
    // System.out.println(b.val);
    // System.out.println(c.val);
    // System.out.println(d.val);
    }
}


//CREATION
class Node{
  int val;
  Node next;
  //ACESSING VAL
  Node(int val){
    this.val = val;
  }
}