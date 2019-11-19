public class Solution {
	// DO NOT MODIFY BOTH THE LISTS
	public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
	    
	    if(a.size() > b.size()) return findMedianSortedArrays(b, a);
	        
	    int start = 0;
	    int end = a.size();
	    
	    while(start <= end){
	        
	           int partition_x = start + (end-start)/2;
	           int partition_y = (a.size()+b.size()+1)/2 - partition_x;
	        
	           int leftMax_a = (partition_x == 0) ? Integer.MIN_VALUE : a.get(partition_x-1);
	           int rightMin_a = (partition_x == a.size()) ? Integer.MAX_VALUE : a.get(partition_x);
	        
	           
               int leftMax_b = (partition_y == 0) ? Integer.MIN_VALUE : b.get(partition_y-1);
               int rightMin_b = (partition_y == b.size()) ? Integer.MAX_VALUE : b.get(partition_y);
	        
	            
	           if(leftMax_a <= rightMin_b && leftMax_b <= rightMin_a){
	               
	               if((a.size()+b.size()) % 2 == 0) return (Math.max(leftMax_a,leftMax_b) + Math.min(rightMin_a,rightMin_b))/2.0;
	               else return Math.max(leftMax_a,leftMax_b)/1.0;
	               
	           }else if(leftMax_a > rightMin_b) end = partition_x -1;
	           
	           else start = partition_x + 1;
	        
	    }
	    
	    return -1.0;
	}
	
}
