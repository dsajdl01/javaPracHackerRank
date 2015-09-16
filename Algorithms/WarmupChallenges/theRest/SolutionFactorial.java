package mathematics;
import java.math.*;


/**
 * Class SolutionFactorial.
 * 
 * @author David Sajdl 
 * @version 16/09/2015
 */
public class SolutionFactorial {
     
      public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        double n = 25;
        BigInteger f = new BigInteger("1"); 
        for(int i = 1; i <= n; i++){
            f = f.multiply(bigN(i));
        }
        System.out.println(f.toString());
    }
    
    public static BigInteger bigN(int n){
        String i = n + "";
        return new BigInteger(i);
    }
}
