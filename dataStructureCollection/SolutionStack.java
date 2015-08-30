import java.util.*;

/**
 * class SolutionStack
 * 
 * @author David Sajd 
 * @version 30/08/2015 
 */
public class SolutionStack{
  
   public static void main(String []argh){ 
       
      String[] test = {"{}()","({()})","{}(","[]"};
      String[] test1 = {"({}[])","(({()})))","({(){}()})()({(){}()})(){()}",
                        "{}()))(()()({}}{}","}}}}","))))","{{{","(((",
                        "[]{}(){()}((())){{{}}}{()()}{{}{}}","[[]][][]"};
      
      for(int i = 0; i < test.length;i++){
         System.out.println("Array, " + test[i] + ", balance is " + isBalanced(test[i]));
      }
      
      for(int i = 0; i < test1.length;i++){
         System.out.println("Array, " + test1[i] + ", balance is " + isBalanced(test1[i]));
      }
   }
    
   public static boolean isBalanced(String str){
      
       if ((str.length() % 2) != 0 || str.length() == 0){
           return false;
       }
       
       Map<Character, Character> b = new HashMap<Character, Character>();
       b.put('[', ']');
       b.put('{', '}');
       b.put('(', ')');
       
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (b.containsKey(str.charAt(i))) {
                st.push(str.charAt(i));
            } else if (st.empty() || (str.charAt(i) != b.get(st.pop()))) {
                return false;
            } 
        }
       return true;
   }
}

