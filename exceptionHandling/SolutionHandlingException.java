import java.util.Scanner; 
import java.util.InputMismatchException;

/**
 * SolutionHandlingException
 * 
 * @author David Sajdl 
 * @version 05/09/2015
 */
public class SolutionHandlingException {

    public static void main(String[]args){
    
        while(true){
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Enter -100 to exit \n or enter any integer please: ");
                int n = in.nextInt();
                if(n == -100){
                    System.out.println("<- END ->");
                    return;
                }
                System.out.print("Enter another integer please: ");
                int n1 = in.nextInt();
                int sum = n/n1;
                System.out.println(sum);
            }catch (InputMismatchException ime){
                 System.out.println("java.util.InputMismatchException:");
            }catch(Exception e){
                System.out.println(e.toString());
            }
            System.out.println();
        }      
    }
}
