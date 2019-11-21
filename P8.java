public class Solution {
    public int sqrt(int a) {
        
        int start = 1;
        int end = a;
        int ans = 0;
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(mid <= a/mid) {
                ans = mid;
                start = mid + 1;
            }else
                end = mid - 1;
            
        }
        return ans;
    }
}
