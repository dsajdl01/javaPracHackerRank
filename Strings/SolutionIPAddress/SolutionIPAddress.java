import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class SolutionIPAddress.
 * 
 * @author David Sajdl 
 * @version 24/08/2015
 */
public class SolutionIPAddress {
    
    public static void main(String []args) {
        
        myRegex rg  = new myRegex(); 
        String IP[] = {"000.12.12.034","121.234.12.12","23.45.12.56",
                        "00.12.123.123123.123","122.23","Hello.IP"};
        for(int i = 0; i < IP.length;i++){
            System.out.println(IP[i] + " --> " + IP[i].matches(rg.getPattern()));
        }
        String[] IP2 = {"12.12.12.12","13.13.13.112","VUUT.12.12","111.111.11.111",
                      "1.1.1.1.1.1.1",".....","1...1..1..1","0.0.0.0","255.0.255.0",
                      "266.266.266.266","00000.000000.0000000.00001","0023.0012.0012.0034"};
        
        for(int i = 0; i < IP2.length;i++){
            System.out.println(IP2[i] + " --> " + IP2[i].matches(rg.getPattern()));
        }
    }
}
