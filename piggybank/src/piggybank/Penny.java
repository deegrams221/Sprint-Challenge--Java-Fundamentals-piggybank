package piggybank;

public class Penny extends AbstractMoney 
{

    // Pass from AbstractMoney
    public Penny(int count) 
    {

        super(count);
    }

    public Penny() 
    {

        super();
    }

    // overrides from AbstractMoney
    @Override
    // if the count = 1 then return count + Penny
    // if the count != 1 then add the count to Pennies
    public String getCount() 
    {
        if (count == 1)
        {
            return count + " Penny";
        } else 
        {
            return count + " Pennies";
        }
    }

    @Override
    public double getTotal() 
    {
        return count * 0.01;
    }
} 