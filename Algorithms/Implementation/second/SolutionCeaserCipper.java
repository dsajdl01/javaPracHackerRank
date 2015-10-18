package mathematics;

/**
 * class SolutionCeaserCipper.
 * 
 * @author David Sajdl 
 * @version 18/10/2015
 */
public class SolutionCeaserCipper {

	public static void main(String[] args) {
		String str = "middle-Outz";
		int k = 2;
		System.out.println(cipper(str, k));

	}
	
	public static String cipper(String s, int k){
		char[] c = s.toCharArray();
		String swapped = "";
		for(int i =0; i < c.length; i++){
			swapped += ""+ swapChar(c[i], k);
		}
		return swapped;
	}
	
	public static char swapChar(char c, int k){
		if(!Character.isAlphabetic(c)) return c;
		char base = 'A';
		if(c > 'a') base = 'a';
		return (char)(((c-base+k)%26)+base);
		
	}
}
