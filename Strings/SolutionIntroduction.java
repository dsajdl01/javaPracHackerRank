package mathematics;


/**
 * Class SolutionIntroduction.
 * 
 * @author David Sajdl 
 * @version 18/09/2015
 */
public class SolutionIntroduction {
   
    public static void main(String[]args){
        String A = "hello";
        String B = "java";
        System.out.println(getLengthOfTwoString(A,B));
        System.out.println(isFirstStrLager(A,B));
        System.out.println(uppercaseFirstLetter(A) + " " + uppercaseFirstLetter(B));
    }
    
    public static int getLengthOfTwoString(String a, String b){
        return a.length() + b.length();
    }
    
    public static String isFirstStrLager(String a, String b){
        return (a.compareTo(b) > 0) ? "Yes" : "No";
    }
    
    public static String uppercaseFirstLetter(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }

}
