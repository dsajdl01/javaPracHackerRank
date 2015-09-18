package mathematics;


/**
 * Class SolutionReverse.
 * 
 * @author David Sajdl 
 * @version 18/09/2015
 */
public class SolutionReverse {
    
    public static void main(String[]args){
        String[] A = {"madam", "anna", "reviver", "david"};
        for(String a : A){
            System.out.println(isPalindrome(a));
        }
    }
   
     public static String isPalindrome(String str){

        int n = str.length();
        int mid;
        if(n%2 == 0){
            mid = (int) n / 2;
        } else {
            mid = (int) ((n+1) / 2)-1;
        }
       
        for(int i = 0; i < mid; i++){
            if(str.charAt(i) != str.charAt(n-1)){
                return "No";   
            }
            n--;
        }
        return "Yes";
    }
}
