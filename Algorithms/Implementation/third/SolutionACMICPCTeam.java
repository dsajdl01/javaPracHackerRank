package Implementation;
/**
 * class SolutionACMICPCTeam.
 * 
 * @author David Sajdl 
 * @version 19/10/2015
 */
public class SolutionACMICPCTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int people = 4;
        int topic = 5;
        String[] know = new String[people];
        know[0] = "10101"; 
        know[1] = "11100";
   		know[2] = "11010"; 
		know[3] = "00101";
 
        char[][] grid = getDimentialCharOfString(know, topic);
        int[] result = getMaxTopicAndKnow(grid, topic);
        System.out.println(result[0] + "\n" + result[1]);
	}

	public static char[][] getDimentialCharOfString(String[] k, int t){
	        char[][] c = new char[k.length][t];
	        for(int i = 0; i < k.length; i++){
	            c[i] = k[i].toCharArray();
	        }
	        return c; 
	}
	 
	public static int[] getMaxTopicAndKnow(char[][] c, int t){
        int[] res = new int[2];
        int count = 0, know = 0, max = - 1;
        for(int i = 0; i < c.length -1; i++){
            for(int j = i +1; j < c.length; j++){
                know = 0;
                for(int x = 0; x < t; x++){
                    if(c[i][x] == '1'||c[j][x] == '1'){
                        know++;
                    }
                   // System.out.print((char)c[i][x] +" "+ (char)c[j][x]  + "| ");
                }
               // System.out.println(" = "+know);
                
                if(max == know) count++;
                
                if(max < know) {
                    count = 1;
                    max = know;
                }
                
                
            }
          //  System.out.println("-------------------------------------");
        }
          //  System.out.println(max + ", " + count);
        res[0] = max;
        res[1] = count;
        return res;
    }
}
