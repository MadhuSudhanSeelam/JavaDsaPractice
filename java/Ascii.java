import java.util.Scanner;
public class Ascii{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphapet ");
        char a = sc.next().charAt(0);
        int b = (int)a;
        
        System.out.println("Enter a Alphabet: "+a);
        System.out.println("The ASCII value "+ a +" is: "+b);
    }
}