
/**
 * class myRegex.
 * 
 * @author David Sajdl
 * @version 24/08/2015
 */
public class myRegex {
    
        private String pattern = "([01][0-9][0-9]|2[0-4][0-9]|25[0-5]|\\d{1,2})+\\."+
                                "([01][0-9][0-9]|2[0-4][0-9]|25[0-5]|\\d{1,2})+\\."+
                                "([01][0-9][0-9]|2[0-4][0-9]|25[0-5]|\\d{1,2})+\\."+
                                "([01][0-9][0-9]|2[0-4][0-9]|25[0-5]|\\d{1,2})";

        public String getPattern(){
            return this.pattern;
        }
}
