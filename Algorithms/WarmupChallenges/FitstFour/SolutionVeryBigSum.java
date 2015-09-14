package mathematics;
import java.math.BigInteger;


/**
 * SolutionVeryBigSum here.
 * 
 * @author David Sajdl 
 * @version 14/09/2015
 */
public class SolutionVeryBigSum {
    
    public static void main(String[] args) {
  
        int n = 5;
        BigInteger sum = new BigInteger("0");
        String[] input = {"1000000001", "1000000002", "1000000003", "1000000004", "1000000005"};
        for(int i = 0; i < n; i++){
            BigInteger nextNum = new BigInteger(input[i]);
            sum = sum.add(nextNum);
        }
        System.out.println(sum.toString());
    }
}
