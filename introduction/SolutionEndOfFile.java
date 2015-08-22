import java.io.*;
import java.util.Scanner;

/**
 * class SolutionEndOfFile.
 * 
 * @author David Sajdl 
 * @version 22/08/2015  
 */
public class SolutionEndOfFile{
    
      public static void main(String[] args) {
       
        try{
            File theFile = new File("textToEndOfFile.txt");
            Scanner in = new Scanner(theFile);
            int i = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(i + " "+line);
                i++;
            }
        } catch(FileNotFoundException e){
                e.printStackTrace();
        }
    }
}
