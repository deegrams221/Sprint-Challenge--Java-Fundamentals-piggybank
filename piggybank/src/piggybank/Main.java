// compile commands: javac piggybank/*.java
//                   jar cvfe piggybank.jar piggybank.Main piggybank/*.class
//                   java -jar piggybank.jar

package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<Money> piggyBank = new ArrayList<Money>();

        // * A Dollar worth $1.00
        // * A Quarter worth $0.25
        // * A Dime worth $0.10
        // * A Nickel worth $0.05
        // * A Penny worth $0.01 

        // Create collection
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
        // * on the console should appear  
        // `1 Quarter`  
        // `1 Dime`  
        // `$5`  
        // `3 Nickels`  
        // `7 Dimes`  
        // `$1`  
        // `10 Pennies`  

        double bankTotal = 0.00;
        for (int i = 0; i < piggyBank.size(); i++)
        {
            bankTotal += piggyBank.get(i).getValue();
        }
        System.out.println("\nThe piggy bank holds " + fp.format(myValue));
        
        // Print the contents of the Piggybank
        System.out.println("\nInside the piggybank is:\n");
        piggyBank.forEach(m -> System.out.println(m.getCount()));
    }
}