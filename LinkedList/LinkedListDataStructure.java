
public class LinkedListDataStructure {
  
    public static void main(String[] args) {
      // System.out.println("Hello, World!");
      
      Linkedlist ll = new Linkedlist();
      
      /*
      Method we created
      addFirst
      addlast
      
      deleteFirst
      insert
      delete
      
      search
      get
      display
      */
      ll.addFirst(80);
      ll.addlast(20);
      ll.addFirst(90);
      ll.addlast(30);
      ll.addlast(50);
      ll.addFirst(70);
      ll.insert(45,1);
      ll.display();
      // System.out.println(ll.get(4));
      ll.delete(3);
      ll.display();
    }
}

class Linkedlist{
  Node head;
  Node tail;
  int size;
  
  
  
  void addlast(int val){
    Node t = new Node(val);
    if(head == null) head = tail = t;
    else{
    tail.next = t;
    tail = t;
    }
    size++;
  }
  
  
  
  void addFirst(int val){
    Node t = new Node(val);
    if(head == null) head = tail = t;
    else{
    t.next = head;
    head = t;
    }
    size++;
  }
  
  
  void deleteFirst(){
    if(head == null){//1
      System.out.println("List is Empty, You can't Delete the First Element");
      return;
    }
    
    head = head.next;//2
    
    if(head == null){//3
     System.out.println("Element is deleted, Your List is Empty."); 
    tail = null;
    }
    size--;
  }
  
  
  
  
  void insert(int val, int idx){
    if(idx < 0 ||idx > size) System.out.println("Invalid");
    else if(idx == 0) addFirst(val);
    else if(idx == size) addlast(val);
    else{
    Node temp = head;
    for(int i=1;i<idx;i++){
      temp = temp.next;
    }
    
    Node t = new Node(val);
      t.next = temp.next;
      temp.next = t;
      size++;
  }
}


  void delete(int idx){
    if(idx<0 || idx >=size)return;
    
    else if(idx == 0){ 
      deleteFirst();
      return;
    }
    
    Node temp = head;
    
    for(int i=0;i<idx-1;i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;//delete
    
    if(idx == size-1)tail = temp;
    size--;
    
  }
  
  
  
  int search(int val){
    if(head == null) return -1;
    Node temp = head;
    int idx =0;
    while(temp != null){
    if(temp.val == val) return idx;
      temp = temp.next;
      idx++;
    }
    System.out.println();
    return -1;
  }
  
  
  int get(int idx){
    if(idx > size) return -1;
    Node temp = head;
    for(int i=1;i<=idx;i++){
      temp = temp.next;
    }
    return temp.val;
  }
  
  
  void display(){
    if(head == null) return;
    Node temp = head;
    while(temp != null){
      System.out.print(temp.val+" ");
      temp = temp.next;
    }
    System.out.println();
  }
}


class Node{
  int val;
  Node next;
  
  Node(int val){
    this.val = val;
  }
}