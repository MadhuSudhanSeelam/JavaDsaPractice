import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();
        ArrayList<Integer> crr = new ArrayList<>();

        arr.add(10); arr.add(20); arr.add(30); arr.add(40);
        brr.add(10); brr.add(20); brr.add(30); brr.add(40);
        crr.add(10); crr.add(20); crr.add(30); crr.add(40);

        ans.add(arr);
        ans.add(brr);
        ans.add(crr);

        System.out.println(ans.get(1));
        System.out.println(ans.get(1).set(2, 85));
        System.out.println(ans.get(1));
        System.out.println(ans);
    }
}