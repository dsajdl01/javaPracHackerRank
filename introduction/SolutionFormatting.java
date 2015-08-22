
import java.text.DecimalFormat;
/**
*
* @author David Sajdl
* @date 22/08/2015
*/
public class SolutionFormatting {

    public static void main(String[] args) {
            String[] text = {"java", "cpp", "python"};
            int[] num = {100, 65, 50};
            System.out.println("================================");
            for(int i=0;i<text.length;i++)
            {
                String s1 = text[i];
                int x = num[i];
                System.out.println(String.format("%-14s %s", s1 , formatNumber(x)) );
            }
            System.out.println("================================");

    }
     public static String formatNumber(int n){
        return new DecimalFormat("000").format(n);
    }
}
