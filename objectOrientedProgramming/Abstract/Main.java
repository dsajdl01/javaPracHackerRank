package OOP;


/**
 * class Main or Driver.
 * 
 * @author David Sajdl 
 * @version 23/09/2015
 */
public class Main {
    
     public static void main(String[]args){
     
         String title = "A tale of two cities";
         MyBook new_novel=new MyBook();
         new_novel.setTitle(title);
         System.out.println("The title is: "+new_novel.getTitle());
     }
}
