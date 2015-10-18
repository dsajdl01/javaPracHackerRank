package mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * class SolutionCavityMap.
 * 
 * @author David Sajdl 
 * @version 18/10/2015
 */

public class SolutionCavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4; 
		String[] data = {"1112","1912","1892","1234"}; 
	        if(n > 2){
	            int[][] intMap = convertToInt(data, n);
	            String[] mapDeep = getDeep(intMap);
	            for(int i = 0; i < mapDeep.length; i++){
	                System.out.println(mapDeep[i]);
	            }
	        } else {
	            for(int i = 0; i < n; i++){
	                System.out.println(data[i]);
	        }
	        }

	}
	  
    public static int[][] convertToInt(String[] map, int n){
        int[][] m = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                m[i][j] = Integer.parseInt(map[i].substring(j,j+1));
            }
        }
        return m;
    }
    
    public static String[] getDeep(int[][] m){
         String[] mapdeep = new String[m.length];
         List<Integer> indexes = new ArrayList<Integer>();
             for(int i = 1; i < m.length -1; i++){
                for(int j = 1; j < m[i].length - 1; j++){
                    int deep = m[i][j];
                    if(deep > m[i-1][j]&& deep > m[i+1][j]&&deep > m[i][j-1]&& deep > m[i][j+1]){
                        indexes.add(i);
                        indexes.add(j);
                    }
                }
             }
           
        int size = indexes.size();
        int st = 0;
        String line = "";
            for(int i = 0; i < m.length; i++){
                line = "";
                    for(int j = 0; j < m[i].length; j++){
                        if(size != 0 && indexes.get(st) == i && indexes.get(st+1)== j){
                            line += "X";
                            if(st + 2 < size){
                                st = st + 2;
                            }
                        } 
                        else {
                          //  System.out.print(m[i][j] +", ");
                            line +=  ""+m[i][j];
                        }
                    }
                mapdeep[i] = line;
            }
        return mapdeep;
   }

}
