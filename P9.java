public class Solution {
    
    int mod = 10000003;
    
    public int numWorker(List<Integer> C, long w){
    
        long sum = 0;
        int count = 1;
        
        for(int i=0;i<C.size();i++){
            
            sum += C.get(i);
            
            if(sum > w){
                
                sum = C.get(i);    
                count++;
                
            }       
            
        }
        
        return count;
        
    } 


    public int paint(int A, int B, ArrayList<Integer> C) {
        
        
        long end = 0;
        
        for(Integer x : C) end += x;
        
        long start = Collections.max(C);
        
        
        while(start < end){
            
            
            long mid = start + (end-start)/2;
            
            int w = numWorker(C, mid);    
            
            if(w <= A)
                end = mid;
            else start = mid + 1;
            
        }
        
        long temp = start % mod;
        long temp1 = B % mod;
        long a = (temp * temp1) % mod;
        
        
        return (int) a;
        
    }
    
}
