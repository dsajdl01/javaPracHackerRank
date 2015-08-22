
/**
 * class SolutionDataType
 * 
 * @author David Sajdl 
 * @version 22/08/2015
 */
public class SolutionDataType {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String[] numbers = { "-150", "150000", 
                             "1500000000", 
                             "213333333333333333333333333333333333", 
                             "-100000000000000"};
        int T = numbers.length;
        
        
        for(int i = 0; i < T; i++){
            getTypeOfValue(numbers[i]);
        }
    }
    public static void getTypeOfValue(String n){
        
        boolean isFound = true;
        for(int i = 0; i<4; i++){
            if(i == 0){
                try{
                    byte b = Byte.valueOf(n);
                    if(isFound){
                        isFound = printStates(n);
                    }
                    printType(b);
                } catch (Exception e){}
            }else if(i == 1){
                try{
                    Short s = Short.parseShort(n);
                    if(isFound){
                        isFound = printStates(n);
                    }
                    printType(s);
                } catch (Exception e){}
            }else if(i == 2){
                try{
                    int numInt = Integer.parseInt(n);
                    if(isFound){
                        isFound = printStates(n);
                    }
                    printType(numInt);
                } catch (Exception e){}
            }else if(i == 3){
                try{
                    long l = Long.parseLong(n);
                    if(isFound){
                        isFound = printStates(n);
                    }
                    printType(l);
                } catch (Exception e){
                    System.out.println(n + " can't be fitted anywhere.");
                }
            }
        }
    
    }
    
    public static boolean printStates(String l){
        System.out.println(l + " can be fitted in:");
        return false;
    }
    
    public static void printType(byte n){
            System.out.println("* byte");
    }
    
    public static void printType(Short n){
            System.out.println("* short");
    }
    
    public static void printType(int n){
          System.out.println("* int");
    }
    
    public static void printType(Long n){
        System.out.println("* long");
    }
  
}
  