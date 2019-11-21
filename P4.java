public class Solution {
    
    public int getStudents(List<Integer> A, long num){
        
        int count = 1;
        long sum = 0;
        
        for(int i=0;i<A.size();i++){
            
            sum += A.get(i);
            
            if(sum > num){
                
                sum = A.get(i);
                count++;
            }
            
        }
        return count;
    }
    
    
    public int books(ArrayList<Integer> A, int B) {
    
            if(A.size() < B) return -1;

            long end = 0;
            for(Integer x: A) end += x;
            long start = Collections.max(A);        

            while(start < end){
                
                long mid = start + (end-start)/2;   
                
                int x = getStudents(A, mid);
                
                if(x <= B)  end = mid;
                else
                    start = mid + 1;
            }
        
        return (int) start;
    }
    
    
    
    
}
