package Implementation;

import java.math.BigInteger;
/**
 * class SolutionTaumBday.
 * 
 * @author David Sajdl 
 * @version 19/10/2015
 */
public class SolutionTaumBday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = {{10, 10,1, 1, 1}, 
						{5, 9, 2, 3, 4}, 
						{3, 6, 9, 1, 1}, 		
						{7, 7, 4, 2, 1}, 
						{3, 3, 1, 9, 2}};
		
		int test = data.length;
        for(int i = 0;i < test; i++){
            int B = data[i][0];
            int W = data[i][1];
            int x = data[i][2];
            int y = data[i][3];
            int z = data[i][4];
            System.out.println(getTauman(B,W,x,y,z));
        }

	}

	 public static String getTauman(int B, int W, int X, int Y, int Z){
	        // formula --> B*min(X,Y+Z) + W*min(Y<X+Z)
	        BigInteger b = new BigInteger(""+B);
	        BigInteger w = new BigInteger(W+"");
	        BigInteger b1 = new BigInteger(""+(Math.min(X,Y+Z)));
	        BigInteger w1 = new BigInteger(""+(Math.min(Y,X+Z)));
	        b = b.multiply(b1);
	        w = w.multiply(w1);
	        b = b.add(w);
	        return b.toString();
	  }
}
