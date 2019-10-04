package piggybank;

public class Dime extends MoneyAbstract
{
    public Dime(int count)
    {
        super(count);
        moneyValue = 0.10;
    }

    public Dime()
    {
        moneyValue = 0.10;
    }

    @Override
    public String strValue()
    {
        return count + " Dime";
    }

    @Override
    public String strValueInc()
    {
        if (this.count > 1)
        {
            retrun count + " Dimes";
        } else 
        {
            return strValue();
        }
    }
}