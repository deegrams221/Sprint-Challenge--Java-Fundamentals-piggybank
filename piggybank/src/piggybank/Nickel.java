package piggybank;

public class Nickel extends MoneyAbstract
{
    // fields
    private String name;
    private int count;

    // constructor
    public Nickel(String name, int count)
    {
        super(name, count);
        moneyValue = 0.05;
    }

    public Nickel()
    {
        moneyValue = 0.05;
    }

    // from MoneyAbstract
    @Override
    public String strValue()
    {
        return count + " Nickel";
    }

    @Override
    public String strValueInc()
    {
        if (this.count > 1)
        {
            retrun count + " Nickels";
        } else 
        {
            return strValue();
        }
    }

    @Override
    public String toString()
    {
        return "Nickel{" +
                "name='" + name + '\'' +
                ", count=" + count + 
                '}';
    }
}