import java.util.*;
import java.math.*;

/**
 * class SolutionBigDecimal
 * 
 * @author David Sajd 
 * @version 25/08/2015
 */
public class SolutionBigDecimal{
   
    public static void main(String[]args){
        
        String[] num = {"-100","50","0","56.6","90"};
        String[] num1 = {"123","45","766","324324",".325",".325","-234","4546","100","0"};
        String[] num2 = {".0000000123",".0000000124",".0000000123",".00000001233",".00000001234"};
        int n = num.length;
        printBigNumInDecendingOrder(num, n);
        int n1 = num.length;
        printBigNumInDecendingOrder(num1, n1);
        int n2 = num.length;
        printBigNumInDecendingOrder(num2, n2);
    }
    
    public static void printBigNumInDecendingOrder(String[] strNm, int n){
        List<BigDecimal> bigN = new ArrayList<BigDecimal>();
        for(int i = 0; i< n; i++){
            bigN.add(new BigDecimal(strNm[i]));
        }
       
        Collections.sort(bigN);
        Collections.reverse(bigN);
        for( BigDecimal nm: bigN ){
            String str = nm.toPlainString();
            System.out.println(str.replaceFirst("^0\\.","."));
        }
        System.out.println();
    }
}
