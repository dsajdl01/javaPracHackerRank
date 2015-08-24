
/**
 * class SolutuinString 
 * 
 * @author David Sajdl 
 * @version 24/08/2015
 */
public class SolutionSubstring{

    
    public static void main(String[] args) {
          
            String text = "welcometojava";
            int step =  3;
            String low = text.substring(0, step);
            String high = text.substring(0, step);
            int nextStep = step + 1;
            int subLength = step - 1;
            for(int i = 1; i< text.length() - subLength; i++){
                if(isSudStringLower(text.substring(i,nextStep), low)){
                    low = text.substring(i,nextStep);
                } else if (isSubStringHigher(text.substring(i, nextStep), high)){
                    high = text.substring(i, nextStep);                
                }
                nextStep++;
            }
            System.out.println(low);
            System.out.println(high);
     
    }
    
     public static boolean isSudStringLower(String t, String l){
        if(t.compareTo(l) < 0){
            return true;
        }
        return false;
     }
    
    public static boolean isSubStringHigher(String t, String h){
        if(t.compareTo(h) > 0){
            return true;
        }
        return false;
    }

}
