public class Solution {
    
    public boolean isOk(List<Integer> A, int num, int dis){
        
        int sum = A.get(0);
        int count = 1;
        
        for(int i=1;i<A.size();i++){
            
               if(Math.abs(A.get(i)-sum) >= dis){
                   count++;
                   sum = A.get(i);               
               }         
                
               if(count == num) 
                    return true;
                   
        }   
        
        return false;
    }
    
    
    
    public int solve(ArrayList<Integer> A, int B) {
        
        Collections.sort(A);
    
        int start = Integer.MAX_VALUE, end = 0;
        
        for(int i=1;i<A.size();i++){
            start = Math.min(start, A.get(i)-A.get(i-1));
        }
        
        end = A.get(A.size()-1) - A.get(0);
        
        int ans = 0, mid = 0;
        
        while(start <= end){
            
                mid = start + (end-start)/2;
            
                if(isOk(A, B, mid)){
                    
                    ans = mid;
                    start = mid + 1;
                    
                }else
                    end = mid - 1;
            
        }
        
        return ans;
        
    }
    
    
}
