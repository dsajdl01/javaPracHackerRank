
/**
 * class SolutionInterface
 * 
 * @author David Sajdl 
 * @version 28/08/2015
 */
public class SolutionInterface {

    public static void main(String []args)
    {
        MyCalculator my_calculator=new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        int n= 200;
        System.out.print(my_calculator.divisorSum(n)+"\n");

    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o)
    {

        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    } 
}
