public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        
        long[] cache = new long[A.size()+1];
        cache[0] = 0;
        
        for(int i=0;i<A.size();i++){
            cache[i+1] = A.get(i) + cache[i];
        }
        
        int start = 1;
        int end = A.size();
        int ans = 0;
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            boolean isOk = true;
            
            for(int i=0; i + mid <= A.size(); i++){

                long temp = cache[i+mid] - cache[i]; 
                if(temp > B){
                    isOk = false;
                    break;
                }
            }
            
            if(isOk) {
                ans = mid;
                start = mid+1;
            }
            else end = mid-1; 
        } 
        
        return ans;
    }
}
