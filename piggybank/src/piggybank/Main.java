// compile commands: javac piggybank/*.java
//                   jar cvfe piggybank.jar piggybank.Main piggybank/*.class
//                   java -jar piggybank.jar

package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
    public static void printMoney(ArrayList<MoneyAbstract> moneys, CheckMoney tester) 
    {
        for (MoneyAbstract m : moneys) 
        {
            if (tester.test(m)) 
            {
                System.out.println(m.getValue());
            }
        }
    }

    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        // * A Dollar worth $1.00
        // * A Quarter worth $0.25
        // * A Dime worth $0.10
        // * A Nickel worth $0.05
        // * A Penny worth $0.01 

        ArrayList<MoneyAbstract> piggyBank = new ArrayList<MoneyAbstract>();
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
        
        // Print the contents of the Piggy Bank
        System.out.println("Inside the piggybank is:\n");
        piggyBank.forEach(p -> System.out.println(p.strValueInc()));

        double myValue = 0.0;
        for (MoneyAbstract m : piggyBank)
        {
            myValue = myValue + m.getValue();
        }
        
        System.out.println("The piggy bank holds " + fp.format(myValue));
    }
}