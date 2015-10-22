package Implementation;
/**
 * class SolutionTimeInWords.
 * 
 * @author David Sajdl 
 * @version 22/10/2015
 */
public class SolutionTimeInWords {

	public static void main(String[] args) {

		 int[][] clockData = {{5,45},
		 				   {5,00},
		 				   {5,01},
		 				   {3,10},
		 				   {9,50},
		 				   {11,59},
		 				   {1,25}};
		 for(int i = 0; i < clockData.length; i++){
	         int h = clockData[i][0];
		     int min = clockData[i][1];
	         String hours;
	            if(min == 0 ){
	                hours = getHrsWorld(h);
	                System.out.println(hours + " o' clock");
	            } else {
	                hours = (min <= 30)? getHrsWorld(h) : getHrsWorld(h+1);
	                String minutes = getMinutes(min);
	                System.out.println(minutes + " " + hours);
	            }
		 }

	}
	
	public static String getMinutes(int min){
        String m = " minutes past";
        if(min == 1){
            return getHrsWorld(min) + " minute past";
        }else if(min < 13){
            return getHrsWorld(min) + m; 
        } else if(min == 15){
            return getToHalf(min)+ " past";
        } else if (min < 30){
            return getToHalf(min) + m;
        } else if (min == 30){
            return getToHalf(min) + " past";
        }else {
            m = " minutes to";
            String world = getPastHalf(min);
            if(world.equals("quarter"))
                return world+" to";
            else if(world.equals("one")){
               return  world + " minute to";
            } else {
                return world + " minutes to";
            }
        }
    }
	
    public static String getPastHalf(int m){
        int num = 60 - m;
        return (num < 13) ? getHrsWorld(num) : getToHalf(num);
    }
    
    public static String getToHalf(int m){
        
      if(m <= 20 || m == 30){  
        switch(m){
            case 13: 
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "quarter";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            case 30:
                return "half";
            default:
                return "Unknow number";
            }
            
      } else {
          int num = m % 10;
          return "twenty " + getHrsWorld(num);
      }
    }
    
    public static String getHrsWorld(int h){
        
        switch(h){
            case 1: 
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve"; 
            case 13:
                return "one";
            case 14:
                return "two";
            case 15:
                return "three";
            case 16:
                return "four";
            case 17:
                return "five";
            case 18:
                return "six";
            case 19:
                return "seven";
            case 20:
                return "eight";
            case 21:
                return "nine";
            case 22:
                return "ten";
            case 23:
                return "eleven";
            case 24:
                return "twelve";
            default:
                return "Unknow number";
        }    
    }

}
