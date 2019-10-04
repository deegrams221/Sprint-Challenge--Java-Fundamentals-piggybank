package piggybank;

public class Quarter extends MoneyAbstract
{
    // fields
    // private String name;
    // private int count;

    // constructor
    public Quarter(String name, int count)
    {
        super(name, count);
        moneyValue = 0.25;
    }

    // public Quarter()
    // {
    //     moneyValue = 0.25;
    // }

    // from MoneyAbstract
    @Override
    public String strValue()
    {
        return count + " Quarter";
    }

    @Override
    public String strValueInc()
    {
        if (this.count > 1)
        {
            return count + " Quarters";
        } else 
        {
            return strValue();
        }
    }

    @Override
    public String toString()
    {
        return "Quarter{" +
                "name='" + name + '\'' +
                ", count=" + count + 
                '}';
    }
}