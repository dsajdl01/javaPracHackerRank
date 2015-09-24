package OOP;


/**
 * Class MainClass.
 * 
 * @author David Sajdl 
 * @version 24/09/2015
 */
public class MainClass {
    
    public static void main(String []args) {

      Sports C1 = new Sports();
      Soccer C2 = new Soccer();
      System.out.println(C1.get_name());
      C1.get_number_of_team_members();
      System.out.println(C2.get_name());
      C2.get_number_of_team_members();
   }
    
}
