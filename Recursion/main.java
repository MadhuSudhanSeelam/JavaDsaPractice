import java.util.*;

class Solution {

    public static void main (String[] args) {
        Solution obj = new Solution();
        int arr[] ={1,2,1};
        List<Integer> result = obj.subsetSums(arr);
        for(int s : result) {
            System.out.println(s);
        }
    }





    

    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        subset(0, arr, 0, list);
        Collections.sort(list);
        return list;
    }
    
    public void subset(int ans, int arr[], int idx, List<Integer> list){
        if(idx == arr.length){
            list.add(ans);
            return; 
        }
      
        subset(ans + arr[idx], arr, idx + 1, list);
        subset(ans, arr, idx + 1, list);
    }
}