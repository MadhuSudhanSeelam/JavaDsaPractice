
public class isPrime {
    public static void main(String[] args) {
      int n=97;
      boolean flag = true;
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
          flag = false;
          break;
        }
      }
        if(n==1 || n == 0) System.out.print("Nethier T|F");
        else if(flag == false) System.out.print("Composite number");
        else System.out.print("Prime");

        //for both i and n/i
/* print all numbers
       int n = sc.nextInt();
      for(int i=1;i<=Math.sqrt(n);i++){
        if(n%i==0){
          System.out.print(i+" "+n/i+" ");
        }
      }
 */      
}
}