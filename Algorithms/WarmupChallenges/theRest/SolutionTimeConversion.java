package mathematics;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 * Class SolutionTimeConversion.
 * 
 * @author David Sajdl 
 * @version 16/09/2015
 */
public class SolutionTimeConversion {
    
         
    public static void main(String[] args) {
       
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ssa");
            String date = "07:05:45PM";
            System.out.println(date);
      
            Date d = formatter.parse(date);
            SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
            String strd = f.format(d);
            System.out.println();
            System.out.println(d);
            System.out.println();
            System.out.println(strd);
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
