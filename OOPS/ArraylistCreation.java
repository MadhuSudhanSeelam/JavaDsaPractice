
public class ArraylistCreation {
    public static void main(String[] args) {
      Arraylist arr = new Arraylist(8);
      // System.out.print(arr.cap());
      arr.add(10);
      arr.add(20);
      arr.add(30);
  
      // arr.display();
      // System.out.println(arr.get(1));
      // arr.set(0,90);
      // arr.display();
      // System.out.println(arr.set(1,80));
      // System.out.println();
      // arr.add(40);
      // arr.display();
      
      // arr.remove(2);
      // arr.display();
      // System.out.println(arr.get(1));
      // System.out.println(arr.set(1,80));
      arr.insert(1,80);
      // arr.insert(3,90);
      arr.display();
  }
}
  class Arraylist{
    int arr[];
    int idx=0;
    int size = 0;
    Arraylist(int cap){
      arr = new int[cap];
    }
    
    void add(int ele){
      capInc();
      arr[idx++] = ele;
      size++;
    }
    
    void removeLast(){
      idx--;
      size--;
    }
    
    void remove(int ind){
      for(int i=0;i<arr.length;i++){
        if(i == ind){
          arr[i] = arr[i+1];
        }
      }
      idx--;
      size--;
    }
    
     void insert(int ind,int val){
      // for (int i = size; i > ind; i--) {
      //   if(ind == i) arr[ind] = val;
      //   else arr[i + 1] = arr[i];
      //   }
      //   idx++;
      //   size++;
      
     }
     
     
    
    void display(){
      for(int i=0;i<size;i++){
        System.out.println(arr[i]+" ");
      }
    }
    
    int get(int index){
     return arr[index]; 
    }
    
    int set(int index,int val){
      arr[index] = val;
      return val;
    }
    
    
    
    int cap(){
      return arr.length;
    }
    
    void capInc(){
      if(idx == arr.length){
      int arr2[] = new int[arr.length * 2];
      for(int i=0;i<arr.length;i++){
        arr2[i] = arr[i];
      }
      arr = arr2;
      }
    }
  }