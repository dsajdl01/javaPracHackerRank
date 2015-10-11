package mathematics;


/**
 * class SolutionFindDigits.
 * 
 * @author David Sajdl 
 * @version 11/10/2015
 */
public class SolutionFindDigits { 
    
    public static void main(String[]args){
        int[] nums = {12, 24, 1012};
        
        for(int i = 0; i < nums.length; i++){
            System.out.println(getDigits(nums[i]));
        }
    }
    
    public static int getDigits(int n){
        System.out.print(n + " = ");
        int count = 0;
        int tempN = n;
         while(tempN != 0){
            int mod = tempN % 10;
            
            if(mod != 0) {
                if(n % mod == 0){
                    count++;
                }   
            }
            tempN = tempN/10;
        }
        return count;
    }
}

