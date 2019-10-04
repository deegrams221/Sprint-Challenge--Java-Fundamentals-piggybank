package piggybank;

public class Dollar extends Money
{
    // pass in method from Money
    public Dollar(int count)
    {
        super(count);
    }

    public Dollar()
    {
        super();
    }


    // from Money
    @Override
    public double getValue()
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