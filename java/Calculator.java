import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter a Operator: '+','-','*','/','%','x' to exit");
            char a = sc.next().trim().charAt(0);
            
            if(a == 'x' || a == 'X') {
                break;
            }
            
            System.out.println("Enter two Numbers");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int ans = 0;
            
            if(a == '+'){
                ans = n1 + n2;
                System.out.println(ans);
            }
            else if(a == '-'){
                ans = n1 - n2;
                System.out.println(ans);
            }
            else if(a == '*'){
                ans = n1 * n2;
                System.out.println(ans);
            }
            else if(a == '/'){
                if(n2 != 0){
                    ans = n1 / n2;
                    System.out.println(ans);
                } else {
                    System.out.println("n2 is not be Zero");
                }
            }
            else if(a == '%'){
                if(n2 != 0){
                    ans = n1 % n2;
                    System.out.println(ans);
                } else {
                    System.out.println("n2 is not be Zero");
                }
            }
            else{
                System.out.println("Invalid operations");
            }
        }
    }
}
