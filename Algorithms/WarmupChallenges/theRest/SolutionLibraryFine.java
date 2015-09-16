
package mathematics;


/**
 * Class SolutionLibraryFine.
 * 
 * @author David Sajdl 
 * @version 16/08/2015
 */
public class SolutionLibraryFine{

    public static void main(String[]args){
        String d1 = "28 2 2015";
        String d2 = "15 4 2015";
        String[] d1Arr = d1.split("\\s+");
        String[] d2Arr = d2.split("\\s+");
        int dt1, dt2, diff; 
        if(!d1Arr[2].equals(d2Arr[2])){
            dt1 = toInt(d1Arr[2]);
            dt2 = toInt(d2Arr[2]);
            diff = (dt1 - dt2) * 10000;
        } else if(!d1Arr[1].equals(d2Arr[1])){
            dt1 = toInt(d1Arr[1]);
            dt2 = toInt(d2Arr[1]);
            diff = (dt1 - dt2) * 500;
        } else if(!d1Arr[0].equals(d2Arr[0])){
            dt1 = toInt(d1Arr[0]);
            dt2 = toInt(d2Arr[0]);
            diff = (dt1 - dt2) * 15;
        } else {
            diff = 0;
        }
        if(diff < 0){
            diff = 0;
        }
        System.out.println(diff);
    }
    public static int toInt(String n){
        return Integer.parseInt(n);
    }
}
   