
/**
 * class MyCalculator
 * 
 * @author David Sajd 
 * @version 26/08/2015
 */
public class MyCalculator implements AdvancedArithmetic{
    
    @Override
    public int divisorSum(int n){
        int total = 0;
        for(int i = 1; i< n; i++){
            if(n % i == 0){
             total = total + i;
            }
        }
        return total + n;
    }
   
}
