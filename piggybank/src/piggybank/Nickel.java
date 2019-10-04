package piggybank;

public class Nickel extends Money
{
    // pass in method from Money
    public Nickel(int count)
    {
        super(count);
    }

    public Nickel()
    {
        super();
    }

    // from Money
    @Override
    public double getValue()
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