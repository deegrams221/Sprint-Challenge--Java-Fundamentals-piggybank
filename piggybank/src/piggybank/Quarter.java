package piggybank;

public class Quarter extends Money
{
    // fields
    // private int count;
    // private double value;

    // constructor
    public Quarter(int count)
    {
        super(count);
    }

    public Quarter()
    {
        super(); 
    }

    // from Money
    @Override
    public String getValue()
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