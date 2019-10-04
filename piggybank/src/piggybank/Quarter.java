package piggybank;

public class Quarter extends AbstractMoney 
{

    // Pass from AbstractMoney
    public Quarter(int count) 
    {

        super(count);
    }

    public Quarter() 
    {

        super();
    }

    // overrides from AbstractMoney
    @Override
    // if the count = 1 then return count + Quarter
    // if the count != 1 then add the count to Quarters
    public String getCount() 
    {
        if (count == 1)
        {
            return count + " Quarter";
        } else 
        {
            return count + " Quarters";
        }
    }

    @Override
    public double getTotal() 
    {
        return count * 0.25;
    }
} 