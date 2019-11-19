public class Solution {
    public int solve(int A) {
        
        int count = 0;
        int k = 1;
        
        while(A > 0){
            A -= k;
            k++;
            if(A >= 0) count++;
        }
        
        return count;
    }
}
