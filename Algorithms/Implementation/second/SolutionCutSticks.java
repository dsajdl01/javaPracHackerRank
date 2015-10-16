package mathematics;


/**
 * class SolutionCutSticks.
 * 
 * @author David Sajdl 
 * @version 16/10/2015
 */
public class SolutionCutSticks {
  
    public static void main(String[]args){
        
        int[] ar = {5, 4, 4, 2, 2, 8};
        getLengthCut(ar);
        System.out.println();
        int[] arr = {1, 2, 3, 4, 3, 3, 2, 1};
        getLengthCut(arr);
    }
    
    public static void getLengthCut(int[] a){
        
        int[] arr =fillNewArrayWithValue(a);
        int sum = getPositiveSumOfArray(arr);
        System.out.println(sum);
        int s = getSmallestValue(a);
        while( s > 0){
            for(int i = 0; i < arr.length; i++){
                
                if(arr[i] > 0)  {
                    arr[i] = arr[i] - s;
                }
            }
            sum = getPositiveSumOfArray(arr);
            if(sum > 0){
                System.out.println(sum);
            } else {
                return;
            }
            s = getSmallestValue(arr);
        }
    }
    
    private static int[] fillNewArrayWithValue(int[] old){
        int n = old.length;
        int[] newArr = new int[n];
        for(int i = 0; i < n; i++){
            newArr[i] = old[i];
        }
        return newArr;
    }
    
    private static int getPositiveSumOfArray(int[] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                total++;
            }
        }
        return total;
    }
    
    private static int getSmallestValue(int[] a){
        boolean hasSmallestDigit = false;
        int sm = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++){
            if(sm > a[i] && a[i] > 0){
                sm = a[i];
                hasSmallestDigit = true;
            }
        }
        
       return (hasSmallestDigit)? sm : -1;
    }
}
