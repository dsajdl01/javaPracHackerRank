package mathematics;
/**
 * class CeaserCipper.
 * 
 * @author David Sajdl 
 * @version 18/10/2015
 */

public class CeaserCipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "middle-Outz";
		int k = 2;
		int n = str.length();
		System.out.println(getEncreptCeaserCipperText(str, n, k));

	}

	public static String getEncreptCeaserCipperText(String s, int length, int k){
        String encreptedText = "";
        for(int i = 0; i < length; i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    encreptedText += swapUpperChar(ch, k);
                } else{
                    encreptedText += swapLowerChar(ch, k);
                }
            } else {
                encreptedText += ""+ch;
            }
        
        }
        return encreptedText;
    }
    
    private static String swapUpperChar(char l, int k){
        char[] allLetter = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                            'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int index = 0;
        for(int i = 0; i < allLetter.length; i++){
                if(l == allLetter[i]){
                    index = i;
                    break;
                }
        }
        int newIndex = getNewIndex(index, k);
        return "" + allLetter[newIndex];
    }
    
    private static String swapLowerChar(char l, int k){
        char[] allLetter = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                            'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int index = 0;
        for(int i = 0; i < allLetter.length; i++){
                if(l == allLetter[i]){
                    index = i;
                    break;
                }
        }
        int newIndex = getNewIndex(index, k);
        return "" + allLetter[newIndex];
    }
    
    private static int getNewIndex(int i, int  k){
        int newInd = i + k;
        return getCorrectIndex(newInd);
    }
    
    private static int getCorrectIndex(int i){
        if(i < 26) return i;
        return getCorrectIndex(i-26);
    }
}
