import java.math.BigInteger;
public class Solution {
    public String solve(String A) {
        
        
        long num = Long.valueOf(A);
        int m = (int) (Math.log(num)/Math.log(2));
        BigInteger bn = BigInteger.valueOf(num);
        
        for(int i=m;i>=2;i--){
            
            BigInteger base = BigInteger.valueOf((long)Math.floor(Math.pow(num, 1.0/i)));
            BigInteger left = base.pow(i+1).subtract(BigInteger.ONE);
            BigInteger right = bn.multiply(base.subtract(BigInteger.ONE));
            if(left.equals(right)) return base.toString();
        }
        return String.valueOf(num-1);
    }
}
