package piggybank;

public class Nickel extends Money
{
    // fields
    private int count;
    private int value;

    // constructor
    public Nickel(int count, int value)
    {
        super(count, value);
    }


    // from Money
    @Override
    public double value()
    {
        return count * 0.05;
    }

    @Override
    public String getCount()
    {
        if (count == 1)
        {
            return count + " Nickel";
        } else 
        {
            return count + " Nickels";
        }
    }

    // @Override
    // public String toString()
    // {
    //     return "Nickel{" +
    //             "name='" + name + '\'' +
    //             ", count=" + count + 
    //             '}';
    // }
}