package piggybank;

public class Dime extends Money
{
    // fields
    private int count;
    private double value;

    // pass in method from Money
    public Dime(int count, int value)
    {
        super(count, value);
    }

    // from Money
    @Override
    public double value()
    {
        return count * 0.10;
    }

    @Override
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

    // @Override
    // public String toString()
    // {
    //     return "Dime{" +
    //             "name='" + name + '\'' +
    //             ", count=" + count + 
    //             '}';
    // }
}