package piggybank;

public class Nickel extends AbstractMoney 
{

    // Pass from AbstractMoney
    public Nickel(int count) 
    {

        super(count);
    }

    public Nickel() 
    {

        super();
    }

    // overrides from AbstractMoney
    @Override
    // if the count = 1 then return count + Nickel
    // if the count != 1 then add the count to Nickels
    public String getCount() 
    {
        if (count == 1)
        {
            return count + " Nickel";
        } else 
        {
            return count + " Nickels";
        }
    }

    @Override
    public double getTotal() 
    {
        return count * 0.05;
    }
} 