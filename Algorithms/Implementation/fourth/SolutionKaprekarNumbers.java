package Implementation;

import java.math.BigInteger;
/**
 * class SolutionKaprekarNumbers.
 * 
 * @author David Sajdl 
 * @version 22/10/2015
 */
public class SolutionKaprekarNumbers {

	public static void main(String[] args){
		
		int i = 1; 
        int num = 1000;
        boolean isFind = false;
        for(int j = i; j <= num; j++){
        if(isKaprekarNumber(j)){
                  System.out.print(j + " ");
                  isFind = true;
            }
         }
        if(!isFind){
            System.out.print("INVALID RANGE");
        }
	
	}

	public static boolean isKaprekarNumber(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
         
        BigInteger p = new BigInteger(""+n);
        p = p.multiply(p);
        String num = p.toString();
   
        int l = num.length();
        if(l < 2) return false;
        int mid = (l%2 == 0)? (l/2) : ((l+1)/2)-1;
        return isResultSama(num.substring(0,mid),num.substring(mid), n);
    }
    
    public static boolean isResultSama(String a,String b,int n){
        int st = Integer.parseInt(a);
        int sd = Integer.parseInt(b);
        if(sd == 0) return false;
        return (st+sd == n);
    }
}
