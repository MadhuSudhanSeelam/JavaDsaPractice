    import java.util.*;

public class spcp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sp = sc.nextFloat();
        float cp = sc.nextFloat();
        
        if(sp>cp) System.out.println("Profit is "+(sp-cp)/cp*100+"%");
        else if(sp == cp) System.out.println("No loss or profit");
        else System.out.println("Loss: "+(cp-sp)/cp*100+"%");

    }
}
    
