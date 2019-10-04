package piggybank;

public class Quarter extends Money
{
    // fields
    private int count;
    private double value;

    // constructor
    public Quarter(int count, int value)
    {
        super(count, value);
    }


    // from Money
    @Override
    public double value()
    {
        return count * 0.25;
    }

    @Override
    public String getCount()
    {
        if (count == 1)
        {
            return count + " Quarter";
        } else 
        {
            return count + " Quarters";
        }
    }

    // @Override
    // public String toString()
    // {
    //     return "Quarter{" +
    //             "name='" + name + '\'' +
    //             ", count=" + count + 
    //             '}';
    // }
}