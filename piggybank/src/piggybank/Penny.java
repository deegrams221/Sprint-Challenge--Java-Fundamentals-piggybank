package piggybank;

public class Penny extends Money
{
    // pass in method from Money
    public Penny(int count)
    {
        super(count);
    }

    public Penny()
    {
        super();
    }

    // from Money
    @Override
    public double getValue()
    {
        return count * 0.01;
    }

    @Override
    public String getCount()
    {
        if (count >= 1)
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