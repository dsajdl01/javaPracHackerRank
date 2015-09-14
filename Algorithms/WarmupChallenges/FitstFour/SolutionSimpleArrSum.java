package mathematics;


/**
 * SolutionSimpleArrSum here.
 * 
 * @author David Sajd
 * @version 14/09/2015
 */
public class SolutionSimpleArrSum {
   
    public static void main(String[]args){
    
        int[] arr = {1, 2, 3, 4, 10, 11};
        System.out.println(getArrSum(arr));
        int[] arr1 = {10, 254, -653, 104, 180, 411};
        System.out.println(getArrSum(arr1));
    }
    
    public static int getArrSum(int[] a){
       int total = 0;
       for(int n: a){
           total += n;
        }
      return total;
    }
}
