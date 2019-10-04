package piggybank;

public class Dollar extends MoneyAbstract
{
    // fields
    // private String name;
    // private int count;

    // constructor
    public Dollar(String name, int count)
    {
        super(name, count);
        moneyValue = 1.00;
    }

    // public Dollar()
    // {
    //     moneyValue = 1.00;
    // }

    // from MoneyAbstract
    @Override
    public String strValue()
    {
        return count + " Dollar";
    }

    @Override
    public String strValueInc()
    {
        if (this.count > 1)
        {
            return count + " Dollars";
        } else 
        {
            return strValue();
        }
    }

    @Override
    public String toString()
    {
        return "Dollar{" +
                "name='" + name + '\'' +
                ", count=" + count + 
                '}';
    }
}