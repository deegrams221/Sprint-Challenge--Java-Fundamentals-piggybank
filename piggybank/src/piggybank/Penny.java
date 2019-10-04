package piggybank;

public class Penny extends MoneyAbstract
{
    // fields
    // private String name;
    // private int count;

    // constructor
    public Penny(String name, int count)
    {
        super(name, count);
        moneyValue = 0.01;
    }

    // public Penny()
    // {
    //     moneyValue = 0.01;
    // }

    // from MoneyAbstract
    @Override
    public String strValue()
    {
        return count + " Penny";
    }

    @Override
    public String strValueInc()
    {
        if (this.count > 1)
        {
            return count + " Pennies";
        } else 
        {
            return strValue();
        }
    }

    @Override
    public String toString()
    {
        return "Penny{" +
                "name='" + name + '\'' +
                ", count=" + count + 
                '}';
    }
}