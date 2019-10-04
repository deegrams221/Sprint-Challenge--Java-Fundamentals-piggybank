package piggybank;

public class Dime extends Money
{
    // pass in method from Money
    public Dime(int count)
    {
        super(count);
    }

    public Dime()
    {
        super();
    }

    // from Money
    @Override
    public double getValue()
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