
/**
 * class SolutionRegExpression.
 * 
 * @author David Sajdl 
 * @version 24/08/2015
 */
public class SolutionRegExpression{

    
    public static void main(String[]args){
    
        String text = "He is good, but he doesn't know enough yet?\n";
        System.out.println(text);
        String[] textArr = text.split("\\s+|\\,+|\\?+|\\'+|\\!+|\\.+|\\_+|\\@+");
        for(int i = 0; i < textArr.length; i++){
            if(!textArr[i].trim().equals("")){
                System.out.println(textArr[i]);
            }
        }
    }

}
