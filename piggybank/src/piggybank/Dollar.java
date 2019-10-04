package piggybank;

public class Dollar extends Money
{
    // fields
    private int count;
    private double value;

    // constructor
    public Dollar(int count, int value)
    {
        super(count, value);
    }



    // from Money
    @Override
    public double value()
    {
        return count * 1.00;
    }

    @Override
    public String getCount()
    {
        if (count == 1)
        {
            return "$" + count;
        } else 
        {
            return "$" + count;
        }
    }

    // @Override
    // public String toString()
    // {
    //     return "Dollar{" +
    //             "name='" + name + '\'' +
    //             ", count=" + count + 
    //             '}';
    // }
}