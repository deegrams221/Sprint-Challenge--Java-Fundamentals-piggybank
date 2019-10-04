package piggybank;

public class Dime extends AbstractMoney 
{

    // Pass from AbstractMoney
    public Dime(int count) 
    {

        super(count);
    }

    public Dime() 
    {

        super();
    }

    // overrides from AbstractMoney
    @Override
    // if the count = 1 then return count + Dime
    // if the count != 1 then add the count to Dimes
    public String getCount() 
    {
        if (count == 1)
        {
            return count + " Dime";
        } else 
        {
            return count + " Dimes";
        }
    }

    @Override
    public double getTotal() 
    {
        return count * 0.10;
    }
} 