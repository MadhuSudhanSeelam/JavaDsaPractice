
public class EasyisPrime {
    public static void main(String[] args) {
      int n=5;
      for(int i=2;i<Math.sqrt(n);i++){
        if(n%i == 0){
          System.out.println("Not a Prime");
          return;
        }
      }
          System.out.print("Prime");
        
      
  }
}



    

