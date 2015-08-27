
/**
 * class SolutionExHan
 * 
 * @author David Sajdl 
 * @version 27/08/2015
 */
public class SolutionExHan {
 
        public static void main(String []argh) {
        int[] myArray = {3, 5, 2, 4, -1, -2, -1, 3}; 

        for(int i = 0; i < myArray.length; i = i + 2){
            int n = myArray[i];
            int p = myArray[i+1];
            MyCalculatorExHan M = new MyCalculatorExHan();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
