public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        
        int i = 0, j = a.get(0).size()-1;
        
        while(j >= 0 && j < a.get(0).size() && i >= 0 && i < a.size()){
            
            if(a.get(i).get(j) == b) return 1;
            
            else if(a.get(i).get(j) < b) i++;
            
            else j--;
        }
        
        return 0;
    }
}
