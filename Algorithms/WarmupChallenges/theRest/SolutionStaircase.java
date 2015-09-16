package mathematics;


/**
 * Class SolutionStaircase.
 * 
 * @author David Sajdl
 * @version 16/072015
 */
public class SolutionStaircase
{
     public static void main(String[] args) {
      
        int n = 6;
        String line = "";
        for(int i = 1; i <= n; i++){
            line = "";
            for(int j = 0; j < i; j++){
                line += "#";
            }
            System.out.printf("%"+n+"s\n",line);
        }
    }
}
