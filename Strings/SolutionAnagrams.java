package mathematics;


/**
 * Class SolutionAnagrams.
 * 
 * @author David Sajdl 
 * @version 19/09/2015
 */
public class SolutionAnagrams {
    
    public static void main(String[]args){
        String[] A = {"anagram","anagramm"};  
        String[] B = {"margana", "marganaa"};
        for(int i = 0; i < A.length; i++){
            boolean res = isAnagram(A[i], B[i]); 
            System.out.println(res ? "Anagrams":"Not Anagrams");
        }
    }
    
    public static boolean isAnagram(String a, String b){
        if(a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if(numOfChar(ch, a)!= numOfChar(ch, b)){
                return false;
            }
        }
        return true;
    }
    
    public static int numOfChar(char c, String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(c == str.charAt(i))
                count++;
        }
        return count;
    }
}
