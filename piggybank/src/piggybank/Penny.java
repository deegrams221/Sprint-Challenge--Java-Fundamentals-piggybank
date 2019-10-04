package piggybank;

public class Penny extends Money
{
    // fields
    private int count;
    private int value;

    // constructor
    public Penny(int count, int value)
    {
        super(count, value);
    }

    // from Money
    @Override
    public double value()
    {
        return count * 0.01;
    }

    @Override
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

    // @Override
    // public String toString()
    // {
    //     return "Penny{" +
    //             "name='" + name + '\'' +
    //             ", count=" + count + 
    //             '}';
    // }
}