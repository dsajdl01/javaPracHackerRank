package OOP;


/**
 * Class Soccer.
 * 
 * @author David Sajdl 
 * @version 24/09/2015
 */
class Soccer extends Sports {
   
   String get_name(){
      return "Soccer Class";
   }
   
    void get_number_of_team_members() {
      System.out.println("Each team has 11 players in "+get_name());
   }
}
