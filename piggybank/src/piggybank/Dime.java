package piggybank;

public class Dime extends MoneyAbstract
{
    // fields
    private String name;
    private int count;

    // constructor
    public Dime(String name, int count)
    {
        super(name, count);
        moneyValue = 0.10;
    }

    // public Dime()
    // {
    //     moneyValue = 0.10;
    // }

    // from MoneyAbstract
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
            return count + " Dimes";
        } else 
        {
            return strValue();
        }
    }

    @Override
    public String toString()
    {
        return "Dime{" +
                "name='" + name + '\'' +
                ", count=" + count + 
                '}';
    }
}