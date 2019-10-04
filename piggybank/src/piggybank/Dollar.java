package piggybank;

public class Dollar extends AbstractMoney 
{

    // Pass from AbstractMoney
    public Dollar(int count) 
    {

        super(count);
    }

    public Dollar() 
    {

        super();
    }

    // overrides from AbstractMoney
    @Override
    // return "$" + count
    public String getCount() 
    {
        return "$" + count;
    }

    @Override
    public double getTotal() 
    {
        return count * 1.00;
    }
} 