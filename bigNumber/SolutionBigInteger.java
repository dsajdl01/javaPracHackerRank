import java.math.*;

/**
 * class SolutionBigInteger
 * 
 * @author David Sajd 
 * @version 25/08/2015
 */
public class SolutionBigInteger{
    
     public static void main(String[] args) {
        
        
            String[] numA = {"1234","0","1000012312000000001239324234098745344444444445093475304958340830457304957304670459680456846569456456"};
            String[] numB = {"20","12312312312354365499999","2342348230021111111111499999912342492342304523957349573497604580234823094723975394857349573945734555"};
            int nA = numA.length;
            int nB = numB.length;
            if(nA == nB){
                for(int i = 0; i< nA; i++){
                    BigInteger a = new BigInteger(numA[i]);
                    BigInteger b = new BigInteger(numB[i]);
        
                    BigInteger c = a.add(b);
                    BigInteger d = a.multiply(b);
                    
                    System.out.println(a.toString() + " + " +  b.toString() +" = "+ c.toString());
                    System.out.println(a.toString() + " * " +  b.toString() +" = "+ d.toString());
                    System.out.println();
                }
            } else {
                    System.out.println("Sorry the length of the Arrays are not the same.\n numA is: " + nA + " and numB is: " + nB);
            }
    }
}
  
