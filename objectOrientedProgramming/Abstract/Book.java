package OOP;

/**
 * Abstract class Book
 * 
 * @author David Sajdl
 * @version 23/09/2015
 */
public abstract class Book {
    
    String title;
    
    abstract void setTitle(String s);
    
    String getTitle(){
        return title;
    }
}
